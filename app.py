import flask
from flask import jsonify, request


app = flask.Flask(__name__)

#Testing repond JSON 
@app.route('/testJsonResponse', methods=['GET', 'POST'])
def handle_request():
    response = {"message":"Successful Connection"}
    return jsonify(response)


#Testing respond String 
@app.route('/testStringResponse', methods=['GET', 'POST'])
def handle_request_String():
    response = " Successfully connect with String response"
    return jsonify(response)


#Testing POST REQUEST
@app.route('/testPostRequest', methods=['GET', 'POST'])
def handle_post_request():
    content = request.json
    print(content)
    response = " Successfully get the post"
    return jsonify(response)

app.run(host="0.0.0.0", port=5000, debug=True)