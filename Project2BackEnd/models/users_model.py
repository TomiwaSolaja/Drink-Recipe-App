class UsersModel:
    def __init__(self, user_id=0, name="", email="", birth_date="", password=""):
        self.user_id = user_id
        self.name = name
        self.email = email
        self.birth_date = birth_date
        self.password = password

    def __repr__(self):
        return str({
            'user_id': self.user_id,
            'name': self.name,
            'email': self.email,
            'birth_date': self.birth_date,
            'password': self.password
        })

    def json(self):
        return {
            'userId': self.user_id,
            'name': self.name,
            'email': self.email,
            'birthDate': self.birth_date,
            'password': self.password
        }


class Login:

    def __init__(self, user_id=0, email="", password=""):
        self.user_id = user_id
        self.email = email
        self.password = password

    def json(self):
        return {
            'userId': self.user_id,
            'email': self.email,
            'password': self.password

        }

    @staticmethod
    def json_parse(json):
        login = Login()
        login.email = json['email']
        login.password = json['password']
        login.user_id = json['userId'] if 'userId' in json else 0

        return login

    def __repr__(self):
        return str(self.json())

    def __eq__(self, other):
        if not other:
            return False

        if not isinstance(other, Login):
            return False

        return self.__dict__ == other.__dict__



