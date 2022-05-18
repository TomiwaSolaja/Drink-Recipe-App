
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
        return{
            'userId': self.user_id,
            'name': self.name,
            'email': self.email,
            'birthDate': self.birth_date,
            'password': self.password
        }