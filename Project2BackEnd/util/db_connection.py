import psycopg2
from psycopg2._psycopg import OperationalError


def create_connection():
    try:
        conn = psycopg2.connect(

            database='project2',
            user='postgres',
            password='P898ITugc7FMXCLOzwvk',
            host='database-1.cbpbucukjqlm.us-east-1.rds.amazonaws.com',
            port="5432"

        )

        return conn
    except OperationalError as e:
        print(f"{e}")
        return None


connection = create_connection()


def _test():
    print(connection)


if __name__ == '__main__':
    _test()

