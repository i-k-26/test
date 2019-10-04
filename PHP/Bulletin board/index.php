<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>4eachblog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
    <?php
    mb_internal_encoding("utf8");
    $pdo = new PDO("mysql:dbname=ichiro kusano;host=localhost;","root","mysql");
    $stmt = $pdo -> query("select * from 4each_keijiban");
    ?>
    
    <header>
        <div class="logo">
            <img src="4eachblog_logo.jpg">
        </div>
        <ul class="menu">
            <li>トップ</li>
            <li>プロフィール</li>
            <li>4eachについて</li>
            <li>登録フォーム</li>
            <li>問い合わせ</li>
            <li>その他</li>
        </ul>
    </header>
    
    <main>
        <div class="main-contents">
            <div class="right">
                <h1>プログラミングに役立つ掲示板</h1>
                <div class="form">
                    <form method="post" action="insert.php">
                        <h3 class="out1">入力フォーム</h3>
                        <div>
                            <label>ハンドルネーム</label>
                            <br>
                            <input type="text" class="text" size="35" name="handlename">
                        </div>
                    
                        <div>
                            <label>タイトル</label>
                                <br>
                            <input type="text" class="text" size="35" name="title">
                        </div>
                    
                        <div>
                            <label>コメント</label>
                            <br>
                            <textarea rows="7" cols="60"   name="comments"></textarea>
                        </div>
                    
                        <div>
                            <input type="submit"   class="submit" value="投稿する">
                        </div>
                    </form>
                </div>
                
                <?php
                while($row = $stmt -> fetch()){
                    echo "<div class='toukou'>";
                    echo "<h3 class='out2'>".$row['title']."</h3>";
                    echo "<div class='contents'>";
                    echo $row['comments'];
                    echo "<div class='handlename'>posted by ".$row['handlename']."</div>";
                    echo "</div>";
                    echo "</div>";
                }
                ?>
                
            </div>
            
            <div class="left">
                <h3>人気の記事</h3>
                    <ul class="link">
                        <li>PHPオススメ本</li>
                        <li>PHP MyAdminの使い方</li>
                        <li>いま人気のエディタTop5</li>
                        <li>HTMLの基礎</li>                    
                    </ul>
                <h3>オススメリンク</h3>
                    <ul class="link">
                        <li>インターノウス株式会社</li>
                        <li>XAMPPのダウンロード</li>
                        <li>Eclipseのダウンロード</li>
                        <li>Braketsのダウンロード</li>                    
                    </ul>
                <h3>カテゴリ</h3>
                    <ul class="link">
                        <li>HTML</li>
                        <li>PHP</li>
                        <li>MySQL</li>
                        <li>JavaScript</li>                    
                    </ul>
            </div>
        </div> 
    </main>

    
    <footer>
        <div class="foot">copyright internous | 4each blog is the one which provides A to Z about programming</div>
    </footer>
    
</body>    
</html>