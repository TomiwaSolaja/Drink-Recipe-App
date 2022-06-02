import unittest

from models.users_model import UsersModel
from repositories.users_repo_impl import UsersRepoImpl

ur = UsersRepoImpl()
user = UsersModel(name="Test Test", email="test@email.com", birth_date="02-02-2022", password="p@ssword")


class TestUsersRepo(unittest.TestCase):

    def test_acreate_user(self):
        user1 = ur.create_user(user)
        print(user1)

    def test_bget_user(self):
        user = ur.get_user(2)
        print(user)

    def test_cget_all(self):
        print(ur.get_all_users())

    def test_dupdate_users(self):
        user = ur.get_user(2)
        user.name = "Updated Name"
        user = ur.update_user(user)
        print(user)

    def test_edelete_users(self):
        user = ur.get_user(12)
        ur.delete_user(user.user_id)
        print(ur.get_all_users())
