from daos.login_dao import LoginDAO


class LoginService:
    loginDao = LoginDAO()

    @classmethod
    def create_login(cls, login):
        return cls.loginDao.create_login(login)

    @classmethod
    def employee_login(cls, login):
        return cls.loginDao.employee_login(login)
