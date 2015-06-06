### 実際のコード
https://github.com/shin-taro/shin-taro-sezemi-2015-readable-code/blob/master/src/sezemi/RecipiTitle.java

### どうしてリーダブルだと思っているか
* 処理の段階ごとにコメントが書いてある
* 変数の中身を意識して命名


### 実際のコード
String recipi_title = br.readLine();

### どうしてリーダブルだと考えたかの説明
brから読み込まれるデータがレシピのタイトルであることがすぐに理解できる

### この書き方の一言説明
役割で変数命名

### 見つけたきっかけ
while文の中でレシピタイトルの読み込み処理を読んで、
その処理で何が読み込まれているのかを変数名から自然に理解していたことに気付いた。


### 実際のコード
String target_file_name = InputString(sc);
...
File target_file = new File(target_file_name);

### どうしてリーダブルだと考えたかの説明
入力される文字列が読み込み対象のファイル名であることを
表している。

### この書き方の一言説明
役割で変数命名


