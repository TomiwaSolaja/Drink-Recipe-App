class Login:

    def __init__(self, username="", password="", id=0):
        self.username = username
        self.password = password
        self.id = id

    def json(self):
        return {
            "username": self.username,
            "password": self.password,
            "id": self.id
        }

    @staticmethod
    def json_parse(json):
        login = Login()
        login.username = json["username"]
        login.password = json["password"]
        login.id = json["id"] if "id" in json else 0
        return login

    def __repr__(self):
        return str(self.json())
    