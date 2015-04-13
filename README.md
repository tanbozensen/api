# 田んぼ前線サーバーサイドAPI

# Root URL
http://tanbozensen.herokuapp.com

## 公開API

### 田んぼ情報登録

#### Request

##### URL

POST /api/tanbos/

##### JSON

""
{
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"rice_type": 1,
"doneDate": "2015-01-01"
}
""

|param|型|説明|
|:-----------|:------------|:------------|
|latitude|Number|緯度|
|longitude|Number|軽度|
|phase|Number|0:田植え、1:稲刈り|
|rice_type|Number|0:ささにしき、1:こしひかり|
|doneDate|String|YYYY-MM-DD形式|

#### Reply

##### StatusCode

201 Created

##### JSON

>
{
"id" : 1
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"rice_type": 1,
"doneDate": "2015-01-01"
}

### 田んぼ情報一覧取得

#### Request

##### URL

GET /api/tanbos?year=xxxx

|param|説明|
|:-----------|:------------|
|year|yyyy指定|

#### Reply

##### StatusCode

200 OK

##### JSON

>
[
{
"id" : 1
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"rice_type": 1,
"doneDate": "2015-01-01"
},
...
]

