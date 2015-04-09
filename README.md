# 田んぼ前線サーバーサイドAPI

## 公開API

### 田んぼ情報登録

* URL Param

POST /api/tanbos/

** リクエストJSON

>{
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"lice_type": 1,
"doneDate": "2015-01-01"
}

|param|型|説明|
|latitude|Number|緯度|
|longitude|Number|軽度|
|phase|Number|0:田植え、1:稲刈り|
|phase|Number|0:ささにしき、1:こしひかり|
|phase|String|YYYY-MM-DD形式|

** リプライJSON

** StatusCode

201 Created

** JSON

{
"id" : 1
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"lice_type": 1,
"doneDate": "2015-01-01"
}


### 田んぼ情報一覧取得


* URL Param

GET /api/tanbos?year=xxxx

* Request Param
|param|説明|
|year|yyyy指定|

