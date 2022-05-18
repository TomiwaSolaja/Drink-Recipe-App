from repositories.users_repo import UsersRepo


class UsersService:

    def __init__(self, users_repo: UsersRepo):
        self.users_repo = users_repo

    def create_user(self, user):
        return self.users_repo.create_user(user)

    def get_user(self, user_id):
        return self.users_repo.get_user(user_id)

    def get_all_users(self):
        return self.users_repo.get_all_users()

    def update_user(self, change):
        return self.users_repo.update_user(change)

    def delete_user(self, user_id):
        return self.users_repo.delete_user(user_id)
