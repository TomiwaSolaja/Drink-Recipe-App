from exceptions.invalid_argument import InvalidArgument
from exceptions.resource_not_found import ResourceNotFound
from models.login import Login
from models.users_model import UsersModel
from repositories.users_repo import UsersRepo
from repositories.users_repo_impl import UsersRepoImpl
from flask import request, jsonify

from services.login_service import LoginService
from services.users_service import UsersService

ur = UsersRepoImpl()
us = UsersService(ur)


def route(app):
    # login employee
    # @app.route("/users/login", methods=["POST"])
    # def login():
    #     users = us.login(
    #         request.json['name'], request.json['password'])
    #     if users is None:
    #         return request.json, 403
    #
    #     print(users.user_id)
    #     return jsonify({"id": users.user_id}), 200
    @app.route("/login", methods=["POST"])
    def employee_login():
        try:
            login = Login.json_parse(request.json)
            e_login = LoginService.employee_login(login)
            return jsonify(e_login), 200
        except TypeError:
            return "Username or Password is incorrect, please try again", 404

    @app.route("/users", methods=["POST"])
    def register_user():
        body = request.json

        user = UsersModel(name=body["name"], email=body["email"], birth_date=body["birthDate"],
                          password=body["password"])

        user = us.create_user(user)

        return user.json(), 200

    @app.route("/users/<user_id>", methods=["GET"])
    def get_user(user_id):
        try:
            return us.get_user(int(user_id)).json(), 200
        except ValueError as e:
            return "Not a Valid ID", 400
        except ResourceNotFound as r:
            return r.message, 404

    @app.route("/users", methods=["GET"])
    def get_all_users():
        return jsonify([users.json() for users in us.get_all_users()]), 200

    @app.route("/users/<user_id>", methods=["PUT"])
    def update_user(user_id):
        body = request.json

        user = UsersModel(user_id=int(user_id), name=body["name"], email=body["email"], birth_date=body["birthDate"],
                          password=body["password"])

        user = us.update_user(user)

        if isinstance(user, str):
            return user, 404
        else:
            return user.json()

    @app.route("/users/<user_id>", methods=["DELETE"])
    def delete_user(user_id):
        us.delete_user(user_id)
        return '', 204
