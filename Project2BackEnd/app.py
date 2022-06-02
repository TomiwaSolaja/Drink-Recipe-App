from flask import Flask
from controllers import users_controller as mc
from flask_cors import CORS


app = Flask(__name__)
cors = CORS(app)  # For front-end (JavaScript and HTML)


mc.route(app)

if __name__ == '__main__':
    app.run()
    # app.run(debug=True)
