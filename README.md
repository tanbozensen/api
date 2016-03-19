# 田んぼ前線サーバーサイドAPI

# Root URL
http://tanbozensen.herokuapp.com

## 公開API

### 田んぼ情報登録

#### Request

##### URL

POST /api/tanbos/

##### JSON

``` javascript
{
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"rice_type": 1,
"doneDate": "2015-01-01",
"area_under_tillage": 129.29393933
}
```

|param|型|説明|
|:-----------|:------------|:------------|
|latitude|Number|緯度|
|longitude|Number|軽度|
|phase|Number|0:田植え、1:稲刈り|
|rice_type|Number|0:選択なし,1:コシヒカリ,2:ヒノヒカリ,3:ひとめぼれ,4:あきたこまち,5:キヌヒカリ,6:はえぬき, 7:きらら３９７,8:つがるロマン,9:ななつぼし,10:ササニシキ,11:その他|
|done_date|String|YYYY-MM-DD形式|
|area_under_tillage|Number|耕作面積|

#### Reply

##### StatusCode

201 Created

##### JSON

``` javascript
{
"id" : 1
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"rice_type": 1,
"doneDate": "2015-01-01",
"area_under_tillage": 129.29393933
}
```

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

``` javascript
[
{
"id" : 1
"latitude": 10.29393933,
"longitude": 129.29393933,
"phase": 1,
"rice_type": 1,
"doneDate": "2015-01-01",
"area_under_tillage": 129.29393933
},
...
]
```

### 田んぼ情報削除

#### Request

##### URL

DELETE /api/tanbos/{id}

一覧取得で取得できるJSONのidをURLに含めること。

##### JSON

{}

|param|型|説明|
|:-----------|:------------|:------------|

※空のJSONもしくは空白で送信


#### Reply

##### StatusCode

200 OK

##### JSON

本文なし
