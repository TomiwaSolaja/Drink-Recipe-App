from exceptions.resource_not_found import ResourceNotFound
from models.users_model import UsersModel
from repositories.users_repo import UsersRepo
from util.db_connection import connection


# Helper Method
def _build_user(record):
    return UsersModel(user_id=record[0], name=record[1], email=record[2], birth_date=record[3], password=record[4])


class UsersRepoImpl(UsersRepo):

    def create_user(self, user):
        sql = "INSERT INTO users VALUES (DEFAULT,%s,%s,%s,%s) RETURNING *"

        cursor = connection.cursor()
        cursor.execute(sql, [user.name, user.email, user.birth_date, user.password])

        connection.commit()
        record = cursor.fetchone()

        return _build_user(record)

    def get_user(self, user_id):
        sql = "SELECT * FROM users WHERE user_id = %s"
        cursor = connection.cursor()
        cursor.execute(sql, [user_id])
        record = cursor.fetchone()

        if record:
            return _build_user(record)
        else:
            raise ResourceNotFound(f"User with id: {user_id} - Not Found")

    def get_all_users(self):
        sql = "SELECT * FROM users"
        cursor = connection.cursor()
        cursor.execute(sql)

        records = cursor.fetchall()
        user_list = [_build_user(record) for record in records]
        return user_list

    def update_user(self, change):
        sql = "UPDATE users SET name=%s, email=%s, birth_date=%s, password=%s WHERE user_id = %s RETURNING *"
        cursor = connection.cursor()
        cursor.execute(sql, [change.name, change.email, change.birth_date, change.password, change.user_id])
        connection.commit()
        record = cursor.fetchone()
        return _build_user(record)

    def delete_user(self, user_id):
        sql = "DELETE FROM users WHERE user_id = %s"

        cursor = connection.cursor()
        cursor.execute(sql, [user_id])
        connection.commit()


def _test():
    ur = UsersRepoImpl()
    # user = UsersModel(name="Test Test", email="test@email.com", birth_date="02-02-2022", password="p@ssword")
    # user1 = ur.create_user(user)
    # print(user1)

    user = ur.get_user(1)
    print(user)
    print("-------------------------------------------------------")
    print(ur.get_all_users())
    print("-------------------------------------------------------")
    user.name = "Updated Name"
    user = ur.update_user(user)
    print(user)
    print("-------------------------------------------------------")
    ur.delete_user(user.user_id)
    print(ur.get_all_users())
    

if __name__ == '__main__':
    _test()