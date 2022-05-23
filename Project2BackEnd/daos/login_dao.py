from exceptions.login_exception import LoginException
from models.login import Login
from util.db_connection import connection

class LoginDAO:

    def create_login(self, login):
        sql = "INSERT INTO login VALUES(%s, %s, %s) RETURNING *"
        cursor = connection.cursor()
        cursor.execute(sql, (login.username, login.password, login.id))
        connection.commit()
        record = cursor.fetchone()

    @staticmethod
    def employee_login(login):
        sql = "SELECT * FROM login WHERE username = %s AND password = %s"
        cursor = connection.cursor()
        cursor.execute(sql, (login.username, login.password))
        connection.commit()
        record = cursor.fetchone()
        if record:
            return Login(record[0], record[1], record[2]).json()
        else:
            raise LoginException("Incorrect username or password")