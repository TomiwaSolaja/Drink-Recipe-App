import unittest

from models.users_model import UsersModel
from repositories.users_repo_impl import UsersRepoImpl

ur = UsersRepoImpl()
user = UsersModel(name="Test Test", email="test@email.com", birth_date="02-02-2022", password="p@ssword")

user2 = UsersModel(2)


class TestUsersRepo(unittest.TestCase):

    def test_acreate_user_success(self):
        user7 = ur.create_user(user)
        print(user7)

    def test_create_user_fail(self):
        new_user = ur.get_user(2)
        assert new_user.user_id == 2
        message = "User already exists"
        print(message)

        # TestUsersRepo.added_user = ur.create_user(self.added_user.user_id(2))
        #
        # message = "User already exists."
        # self.assertEqual(self.added_user, UsersModel(user_id=2, name="Test Test", email="test@email.com",
        #                                              birth_date="02-02-2022",
        #                                              password="p@ssword"), message)
        # print(self.added_user, user2, message)

    def test_bget_user_success(self):
        user = ur.get_user(2)
        print(user)

    def test_get_user_fail(self):
        pass

    def test_cget_all_users_success(self):
        print(ur.get_all_users())

    def test_get_all_users_fail(self):
        pass

    def test_dupdate_users_success(self):
        user = ur.get_user(2)
        user.name = "Updated Name"
        user = ur.update_user(user)
        print(user)

    def test_update_users_fail(self):
        pass

    def test_edelete_users_success(self):
        user = ur.get_user(12)
        ur.delete_user(user.user_id)
        print(ur.get_all_users())

    def test_delete_users_fail(self):
        pass

    # ur = UsersRepoImpl()
    # user = UsersModel(name="Test Test", email="test@email.com", birth_date="02-02-2022", password="p@ssword")
    # user1 = ur.create_user(user)
    # print(user1)

    # user = ur.get_user(1)
    # print(user)
    # print("-------------------------------------------------------")
    # print(ur.get_all_users())
    # print("-------------------------------------------------------")
    # user.name = "Updated Name"
    # user = ur.update_user(user)
    # print(user)
    # print("-------------------------------------------------------")
    # ur.delete_user(user.user_id)
    # print(ur.get_all_users())
