package com.db.movie_detail.mvp.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：lyy on 2017/5/24 15:45
 */

public class MovieDetailBean {


    /**
     * max : 10
     * average : 2.6
     * details : {"1":36,"3":1,"2":3,"5":2,"4":0}
     * stars : 15
     * min : 0
     */

    private RatingBean rating;
    /**
     * rating : {"max":10,"average":2.6,"details":{"1":36,"3":1,"2":3,"5":2,"4":0},"stars":"15","min":0}
     * reviews_count : 9
     * videos : []
     * wish_count : 229
     * original_title : 恐怖理发店
     * blooper_urls : []
     * collect_count : 380
     * images : {"small":"http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2406903891.webp","large":"http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2406903891.webp","medium":"http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2406903891.webp"}
     * douban_site :
     * year : 2017
     * popular_comments : [{"rating":{"max":5,"value":1,"min":0},"useful_count":207,"author":{"uid":"62598926","avatar":"http://img7.doubanio.com/icon/u62598926-1.jpg","signature":"","alt":"http://www.douban.com/people/62598926/","id":"62598926","name":"小曦讨厌下雨天"},"subject_id":"26865690","content":"太恐怖了！吓得我从第十分钟开始就没敢睁眼睛，最后直接睡着了。","created_at":"2017-01-06 15:16:12","id":"1132938490"},{"rating":{"max":5,"value":2,"min":0},"useful_count":13,"author":{"uid":"BOLABA","avatar":"http://img3.doubanio.com/icon/u4215275-167.jpg","signature":"BMO~~~BMO~~~","alt":"http://www.douban.com/people/BOLABA/","id":"4215275","name":"搪昂昂昂瓷"},"subject_id":"26865690","content":"对于国产恐怖片来说，观影总有着特殊的方式。于是在没有鬼怪的情况下，猜测故事的真相，总还是有那么一些不同寻常的乐趣的。本片与其他国产垃圾片相比，故事确实丰富了一些，但整体还是惨不忍睹。当然也正是这种惨不忍睹的认真吓人（并不吓人），导致了其超越惨不忍睹的认真搞笑的国产喜剧片的搞笑。","created_at":"2017-01-08 01:39:09","id":"1133827201"},{"rating":{"max":5,"value":1,"min":0},"useful_count":14,"author":{"uid":"88046629","avatar":"http://img7.doubanio.com/icon/u88046629-4.jpg","signature":"","alt":"http://www.douban.com/people/88046629/","id":"88046629","name":"沉睡的真真真真"},"subject_id":"26865690","content":"我没看过这篇也知道一分，我就是想来问问大家明知道不好看为什么还来看？？（标题写暂无评分是因为分实在太低了吗？）","created_at":"2017-01-09 23:16:31","id":"1134851423"},{"rating":{"max":5,"value":1,"min":0},"useful_count":62,"author":{"uid":"150848902","avatar":"http://img7.doubanio.com/icon/u150848902-2.jpg","signature":"","alt":"http://www.douban.com/people/150848902/","id":"150848902","name":"皮卡皮卡皮卡啾"},"subject_id":"26865690","content":"第一部恐怖理发店，第二部恐怖美容院，第三部美甲店，第四部恐怖学校，第五部。。。可以一直拍下去，地老天荒","created_at":"2017-01-06 13:12:37","id":"1132879082"}]
     * alt : https://movie.douban.com/subject/26865690/
     * id : 26865690
     * mobile_url : https://movie.douban.com/subject/26865690/mobile
     * photos_count : 27
     * pubdate : 2017-01-06
     * title : 恐怖理发店
     * do_count : null
     * has_video : false
     * share_url : http://m.douban.com/movie/subject/26865690
     * seasons_count : null
     * languages : ["汉语普通话"]
     * schedule_url :
     * writers : [{"avatars":{"small":"http://img3.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"http://img7.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"http://img3.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"","name":"纪然","alt":"https://movie.douban.com/celebrity/1366595/","id":"1366595"},{"avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/1490348628.29.jpg","large":"http://img3.doubanio.com/img/celebrity/large/1490348628.29.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/1490348628.29.jpg"},"name_en":"Shilei Lu","name":"陆诗雷","alt":"https://movie.douban.com/celebrity/1360707/","id":"1360707"}]
     * pubdates : ["2017-01-06(中国大陆)"]
     * website :
     * tags : ["惊悚","一个星都不想给！","烂片之中的烂片啊~","烂片","垃圾","呵呵","中国","MDZZ","真的好恐怖啊！","狗屎"]
     * has_schedule : false
     * durations : ["89分钟"]
     * genres : ["爱情","悬疑","惊悚"]
     * collection : null
     * trailers : [{"medium":"http://img3.doubanio.com/img/trailer/medium/2395934439.jpg?","title":"预告片：正式版 (中文字幕)","subject_id":"26865690","alt":"https://movie.douban.com/trailer/206905/","small":"http://img3.doubanio.com/img/trailer/small/2395934439.jpg?","resource_url":"http://vt1.doubanio.com/201705241545/da6fffcdcd652b6bbed28cb29f803095/view/movie/M/302060905.mp4","id":"206905"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2408079427.jpg?","title":"预告片：终极版 (中文字幕)","subject_id":"26865690","alt":"https://movie.douban.com/trailer/209536/","small":"http://img3.doubanio.com/img/trailer/small/2408079427.jpg?","resource_url":"http://vt1.doubanio.com/201705241545/1183ece34b5f8dc2a13edc818772096b/view/movie/M/302090536.mp4","id":"209536"},{"medium":"http://img7.doubanio.com/img/trailer/medium/2406384532.jpg?","title":"预告片：激情版 (中文字幕)","subject_id":"26865690","alt":"https://movie.douban.com/trailer/209076/","small":"http://img7.doubanio.com/img/trailer/small/2406384532.jpg?","resource_url":"http://vt1.doubanio.com/201705241545/97c6c517a744c3abf18a131f1cfc4c00/view/movie/M/302090076.mp4","id":"209076"}]
     * episodes_count : null
     * trailer_urls : ["http://vt1.doubanio.com/201705241545/da6fffcdcd652b6bbed28cb29f803095/view/movie/M/302060905.mp4","http://vt1.doubanio.com/201705241545/1183ece34b5f8dc2a13edc818772096b/view/movie/M/302090536.mp4","http://vt1.doubanio.com/201705241545/97c6c517a744c3abf18a131f1cfc4c00/view/movie/M/302090076.mp4"]
     * has_ticket : false
     * bloopers : []
     * clip_urls : []
     * current_season : null
     * casts : [{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1495272417.45.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1495272417.45.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1495272417.45.jpg"},"name_en":"Guoer Yin","name":"殷果儿","alt":"https://movie.douban.com/celebrity/1340984/","id":"1340984"},{"avatars":{"small":"http://img3.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"http://img7.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"http://img3.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"Qingan Ren","name":"任青安","alt":"https://movie.douban.com/celebrity/1359164/","id":"1359164"},{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1451209491.55.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1451209491.55.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1451209491.55.jpg"},"name_en":"SungGoo Kang","name":"姜星丘","alt":"https://movie.douban.com/celebrity/1353667/","id":"1353667"},{"avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/1478601324.49.jpg","large":"http://img3.doubanio.com/img/celebrity/large/1478601324.49.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/1478601324.49.jpg"},"name_en":"Jiamin Chen","name":"陈嘉敏","alt":"https://movie.douban.com/celebrity/1340988/","id":"1340988"}]
     * countries : ["中国大陆"]
     * mainland_pubdate : 2017-01-06
     * photos : [{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2406383762.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2406383762.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2406383762.webp","alt":"https://movie.douban.com/photos/photo/2406383762/","id":"2406383762","icon":"http://img7.doubanio.com/view/photo/icon/public/p2406383762.webp"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2411789707.webp","image":"http://img3.doubanio.com/view/photo/photo/public/p2411789707.webp","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2411789707.webp","alt":"https://movie.douban.com/photos/photo/2411789707/","id":"2411789707","icon":"http://img3.doubanio.com/view/photo/icon/public/p2411789707.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2411789702.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2411789702.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2411789702.webp","alt":"https://movie.douban.com/photos/photo/2411789702/","id":"2411789702","icon":"http://img7.doubanio.com/view/photo/icon/public/p2411789702.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2411789693.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2411789693.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2411789693.webp","alt":"https://movie.douban.com/photos/photo/2411789693/","id":"2411789693","icon":"http://img7.doubanio.com/view/photo/icon/public/p2411789693.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2408074732.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2408074732.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2408074732.webp","alt":"https://movie.douban.com/photos/photo/2408074732/","id":"2408074732","icon":"http://img7.doubanio.com/view/photo/icon/public/p2408074732.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2408074723.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2408074723.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2408074723.webp","alt":"https://movie.douban.com/photos/photo/2408074723/","id":"2408074723","icon":"http://img7.doubanio.com/view/photo/icon/public/p2408074723.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2408074715.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2408074715.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2408074715.webp","alt":"https://movie.douban.com/photos/photo/2408074715/","id":"2408074715","icon":"http://img7.doubanio.com/view/photo/icon/public/p2408074715.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2406383761.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2406383761.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2406383761.webp","alt":"https://movie.douban.com/photos/photo/2406383761/","id":"2406383761","icon":"http://img7.doubanio.com/view/photo/icon/public/p2406383761.webp"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2406383759.webp","image":"http://img3.doubanio.com/view/photo/photo/public/p2406383759.webp","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2406383759.webp","alt":"https://movie.douban.com/photos/photo/2406383759/","id":"2406383759","icon":"http://img3.doubanio.com/view/photo/icon/public/p2406383759.webp"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2395927790.webp","image":"http://img7.doubanio.com/view/photo/photo/public/p2395927790.webp","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2395927790.webp","alt":"https://movie.douban.com/photos/photo/2395927790/","id":"2395927790","icon":"http://img7.doubanio.com/view/photo/icon/public/p2395927790.webp"}]
     * summary : 位于深山小镇的理发店发生的一系列灵异奇闻，殷果儿、任青安、姜星丘等人陷入危难绝境中无法脱身，和理发店有关联的人物接连被惨绝杀害，血腥残暴引来人心惶惶，而抽丝剥茧之后的真相更加令人心惊胆战。
     * clips : []
     * subtype : movie
     * directors : [{"avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/1490348628.29.jpg","large":"http://img3.doubanio.com/img/celebrity/large/1490348628.29.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/1490348628.29.jpg"},"name_en":"Shilei Lu","name":"陆诗雷","alt":"https://movie.douban.com/celebrity/1360707/","id":"1360707"}]
     * comments_count : 199
     * popular_reviews : [{"rating":{"max":5,"value":1,"min":0},"title":"国产恐怖片，注定成烂片？","subject_id":"26865690","author":{"uid":"123404248","avatar":"http://img7.doubanio.com/icon/u123404248-3.jpg","signature":"","alt":"http://www.douban.com/people/123404248/","id":"123404248","name":"世界奇妙物语"},"summary":"这一系列国产恐怖片太多，现在总结下国产电影拍摄门槛为什么这么低\u2026\u2026 1.找个导演，内地导演优先考虑(省钱)。 2.去网上热搜榜（也是经纪公司）上挑几个网红明星（省钱）。网红明星就像木偶一样被装扮上了。 3.去...","alt":"https://movie.douban.com/review/8301338/","id":"8301338"},{"rating":{"max":5,"value":1,"min":0},"title":"差到不行","subject_id":"26865690","author":{"uid":"158559795","avatar":"http://img3.doubanio.com/icon/user_normal.jpg","signature":"","alt":"http://www.douban.com/people/158559795/","id":"158559795","name":"依旧箜絔"},"summary":"真的很烂 很烂 成了喜剧 如果评论涉及电影和小说的结局和关键情节，请勾选「有关键情节透露」，豆瓣将显示提示，以免没有看过的人扫兴。  为了尊重创作者的劳动，请不要转载他人文章或提供下载信息。豆瓣鼓励有益...","alt":"https://movie.douban.com/review/8394178/","id":"8394178"},{"rating":{"max":5,"value":1,"min":0},"title":"老套路没创意","subject_id":"26865690","author":{"uid":"149343489","avatar":"http://img7.doubanio.com/icon/u149343489-1.jpg","signature":"","alt":"http://www.douban.com/people/149343489/","id":"149343489","name":"🗿"},"summary":"烂片 嘈点太多了好吗 前面刚开始有鬼出现 后面大部分都是情感戏 最后结果又是人为扮鬼 很多现象也是无法解释的 电为什么说停就停 为什么里面的人可以轻松找到模特厘米的代号？ 每个人那么容易认出自己的手掌印 ？...","alt":"https://movie.douban.com/review/8278482/","id":"8278482"},{"rating":{"max":5,"value":1,"min":0},"title":"?","subject_id":"26865690","author":{"uid":"154276285","avatar":"http://img7.doubanio.com/icon/u154276285-1.jpg","signature":"","alt":"http://www.douban.com/people/154276285/","id":"154276285","name":"👧"},"summary":"超级烂片，让她爹玩一宿，预告片剪辑不错，此片看完预告片即可，看了多余，漏洞百出，穿帮镜头无数，无厘头到了极致。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。...","alt":"https://movie.douban.com/review/8278145/","id":"8278145"},{"rating":{"max":5,"value":4,"min":0},"title":"美发洗浴杀人一条龙服务","subject_id":"26865690","author":{"uid":"2466058","avatar":"http://img7.doubanio.com/icon/u2466058-2.jpg","signature":"","alt":"http://www.douban.com/people/2466058/","id":"2466058","name":"乌鸦电影"},"summary":"理发店能出什么幺蛾子？还能搞出点旁门左道不成？这部《恐怖理发店》实则让人产生好奇。   理发店如今是泛泛地称谓，客人到里面可不止理发，还包括美容美发、运气好了还可以遇到一条龙服务。当然，无论你是什么人...","alt":"https://movie.douban.com/review/8240666/","id":"8240666"},{"rating":{"max":5,"value":4,"min":0},"title":"超长反射弧的女鬼，只对人类的剩者动手","subject_id":"26865690","author":{"uid":"wolfboar","avatar":"http://img7.doubanio.com/icon/u4221524-2.jpg","signature":"新编剧作品创作中......","alt":"http://www.douban.com/people/wolfboar/","id":"4221524","name":"满囤儿"},"summary":"文/满囤儿           我家有只叫DK的狗，反射弧超级长，经常你喊它一声，等快两分钟了才有回应。因为狗狗是个普遍反应比较迅捷的物种，所以它被我们视作百年一见的奇葩。同样的道理，鬼是一个很凶恶的物种。在我...","alt":"https://movie.douban.com/review/8239907/","id":"8239907"},{"rating":{"max":5,"value":4,"min":0},"title":"Word天呀！以后再也不敢去理发店了","subject_id":"26865690","author":{"uid":"70359207","avatar":"http://img3.doubanio.com/icon/u70359207-8.jpg","signature":"百度百家、今日头条作家、影评人","alt":"http://www.douban.com/people/70359207/","id":"70359207","name":"大侃"},"summary":"  惊悚、恐怖类的影片，每周都在影院里现身，不但有固定的消费群体和受众，还时不时灵光一闪在票房上创出佳绩，《恐怖游泳馆》、《床下有人》、《枕边有张脸》等都是其中的代表。当下，观众的欣赏口味不断提升，...","alt":"https://movie.douban.com/review/8239440/","id":"8239440"},{"rating":{"max":5,"value":4,"min":0},"title":"《恐怖理发店》：青丝犹在，魂魄已飞","subject_id":"26865690","author":{"uid":"41576647","avatar":"http://img3.doubanio.com/icon/user_normal.jpg","signature":"","alt":"http://www.douban.com/people/41576647/","id":"41576647","name":"丑鱼尼莫"},"summary":"《恐怖理发店》讲述的是一个发生在理发店的灵异事件，而灵异的背后，总有一些说不清道不明的真相在作祟。但是，当真相一点点水落石出的时候，又总会叫人心悸、惊厥，毛骨悚然，不寒而栗的感觉也悄上心头。  荒山...","alt":"https://movie.douban.com/review/8239886/","id":"8239886"},{"rating":{"max":5,"value":4,"min":0},"title":"乡村人皮客栈玩转猎杀游戏","subject_id":"26865690","author":{"uid":"renlyuan","avatar":"http://img7.doubanio.com/icon/u63738807-3.jpg","signature":"爱看电影","alt":"http://www.douban.com/people/renlyuan/","id":"63738807","name":"铁任的电影笔记"},"summary":"贺岁大战已经打响，媒体都在聚焦《长城》《西游伏妖篇》这样的大阵仗，而历史的经验告诉我们，期待越高往往会失望越大，雷声大的未必下雨点，，反倒是在并不起眼的地方，往往潜伏着未预料的宝藏。果然，我们等到...","alt":"https://movie.douban.com/review/8239441/","id":"8239441"}]
     * ratings_count : 359
     * aka : ["Ghost in Barber's"]
     */

    private int reviews_count;
    private int wish_count;
    private String original_title;
    private int collect_count;
    /**
     * small : http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2406903891.webp
     * large : http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2406903891.webp
     * medium : http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2406903891.webp
     */

    private ImagesBean images;
    private String douban_site;
    private String year;
    private String alt;
    private String id;
    private String mobile_url;
    private int photos_count;
    private String pubdate;
    private String title;
    private Object do_count;
    private boolean has_video;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private String website;
    private boolean has_schedule;
    private Object collection;
    private Object episodes_count;
    private boolean has_ticket;
    private Object current_season;
    private String mainland_pubdate;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<?> videos;
    private List<?> blooper_urls;
    /**
     * rating : {"max":5,"value":1,"min":0}
     * useful_count : 207
     * author : {"uid":"62598926","avatar":"http://img7.doubanio.com/icon/u62598926-1.jpg","signature":"","alt":"http://www.douban.com/people/62598926/","id":"62598926","name":"小曦讨厌下雨天"}
     * subject_id : 26865690
     * content : 太恐怖了！吓得我从第十分钟开始就没敢睁眼睛，最后直接睡着了。
     * created_at : 2017-01-06 15:16:12
     * id : 1132938490
     */

    private List<PopularCommentsBean> popular_comments;
    private List<String> languages;
    /**
     * avatars : {"small":"http://img3.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"http://img7.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"http://img3.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"}
     * name_en :
     * name : 纪然
     * alt : https://movie.douban.com/celebrity/1366595/
     * id : 1366595
     */

    private List<WritersBean> writers;
    private List<String> pubdates;
    private List<String> tags;
    private List<String> durations;
    private List<String> genres;
    /**
     * medium : http://img3.doubanio.com/img/trailer/medium/2395934439.jpg?
     * title : 预告片：正式版 (中文字幕)
     * subject_id : 26865690
     * alt : https://movie.douban.com/trailer/206905/
     * small : http://img3.doubanio.com/img/trailer/small/2395934439.jpg?
     * resource_url : http://vt1.doubanio.com/201705241545/da6fffcdcd652b6bbed28cb29f803095/view/movie/M/302060905.mp4
     * id : 206905
     */

    private List<TrailersBean> trailers;
    private List<String> trailer_urls;
    private List<?> bloopers;
    private List<?> clip_urls;
    /**
     * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/1495272417.45.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1495272417.45.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1495272417.45.jpg"}
     * name_en : Guoer Yin
     * name : 殷果儿
     * alt : https://movie.douban.com/celebrity/1340984/
     * id : 1340984
     */

    private List<PersonDetailBean> casts;
    private List<String> countries;
    /**
     * thumb : http://img7.doubanio.com/view/photo/thumb/public/p2406383762.webp
     * image : http://img7.doubanio.com/view/photo/photo/public/p2406383762.webp
     * cover : http://img7.doubanio.com/view/photo/albumcover/public/p2406383762.webp
     * alt : https://movie.douban.com/photos/photo/2406383762/
     * id : 2406383762
     * icon : http://img7.doubanio.com/view/photo/icon/public/p2406383762.webp
     */

    private List<PhotosBean> photos;
    private List<?> clips;
    /**
     * avatars : {"small":"http://img3.doubanio.com/img/celebrity/small/1490348628.29.jpg","large":"http://img3.doubanio.com/img/celebrity/large/1490348628.29.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/1490348628.29.jpg"}
     * name_en : Shilei Lu
     * name : 陆诗雷
     * alt : https://movie.douban.com/celebrity/1360707/
     * id : 1360707
     */

    private List<PersonDetailBean> directors;
    /**
     * rating : {"max":5,"value":1,"min":0}
     * title : 国产恐怖片，注定成烂片？
     * subject_id : 26865690
     * author : {"uid":"123404248","avatar":"http://img7.doubanio.com/icon/u123404248-3.jpg","signature":"","alt":"http://www.douban.com/people/123404248/","id":"123404248","name":"世界奇妙物语"}
     * summary : 这一系列国产恐怖片太多，现在总结下国产电影拍摄门槛为什么这么低…… 1.找个导演，内地导演优先考虑(省钱)。 2.去网上热搜榜（也是经纪公司）上挑几个网红明星（省钱）。网红明星就像木偶一样被装扮上了。 3.去...
     * alt : https://movie.douban.com/review/8301338/
     * id : 8301338
     */

    private List<PopularReviewsBean> popular_reviews;
    private List<String> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public int getPhotos_count() {
        return photos_count;
    }

    public void setPhotos_count(int photos_count) {
        this.photos_count = photos_count;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isHas_schedule() {
        return has_schedule;
    }

    public void setHas_schedule(boolean has_schedule) {
        this.has_schedule = has_schedule;
    }

    public Object getCollection() {
        return collection;
    }

    public void setCollection(Object collection) {
        this.collection = collection;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public boolean isHas_ticket() {
        return has_ticket;
    }

    public void setHas_ticket(boolean has_ticket) {
        this.has_ticket = has_ticket;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getMainland_pubdate() {
        return mainland_pubdate;
    }

    public void setMainland_pubdate(String mainland_pubdate) {
        this.mainland_pubdate = mainland_pubdate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<?> getVideos() {
        return videos;
    }

    public void setVideos(List<?> videos) {
        this.videos = videos;
    }

    public List<?> getBlooper_urls() {
        return blooper_urls;
    }

    public void setBlooper_urls(List<?> blooper_urls) {
        this.blooper_urls = blooper_urls;
    }

    public List<PopularCommentsBean> getPopular_comments() {
        return popular_comments;
    }

    public void setPopular_comments(List<PopularCommentsBean> popular_comments) {
        this.popular_comments = popular_comments;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<WritersBean> getWriters() {
        return writers;
    }

    public void setWriters(List<WritersBean> writers) {
        this.writers = writers;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getDurations() {
        return durations;
    }

    public void setDurations(List<String> durations) {
        this.durations = durations;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<TrailersBean> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<TrailersBean> trailers) {
        this.trailers = trailers;
    }

    public List<String> getTrailer_urls() {
        return trailer_urls;
    }

    public void setTrailer_urls(List<String> trailer_urls) {
        this.trailer_urls = trailer_urls;
    }

    public List<?> getBloopers() {
        return bloopers;
    }

    public void setBloopers(List<?> bloopers) {
        this.bloopers = bloopers;
    }

    public List<?> getClip_urls() {
        return clip_urls;
    }

    public void setClip_urls(List<?> clip_urls) {
        this.clip_urls = clip_urls;
    }

    public List<PersonDetailBean> getCasts() {
        return casts;
    }

    public void setCasts(List<PersonDetailBean> casts) {
        this.casts = casts;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public List<?> getClips() {
        return clips;
    }

    public void setClips(List<?> clips) {
        this.clips = clips;
    }

    public List<PersonDetailBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<PersonDetailBean> directors) {
        this.directors = directors;
    }

    public List<PopularReviewsBean> getPopular_reviews() {
        return popular_reviews;
    }

    public void setPopular_reviews(List<PopularReviewsBean> popular_reviews) {
        this.popular_reviews = popular_reviews;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        private int max;
        private double average;
        /**
         * 1 : 36
         * 3 : 1
         * 2 : 3
         * 5 : 2
         * 4 : 0
         */

        private DetailsBean details;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public DetailsBean getDetails() {
            return details;
        }

        public void setDetails(DetailsBean details) {
            this.details = details;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public static class DetailsBean {
            @SerializedName("1")
            private int value1;
            @SerializedName("3")
            private int value3;
            @SerializedName("2")
            private int value2;
            @SerializedName("5")
            private int value5;
            @SerializedName("4")
            private int value4;

            public int getValue1() {
                return value1;
            }

            public void setValue1(int value1) {
                this.value1 = value1;
            }

            public int getValue3() {
                return value3;
            }

            public void setValue3(int value3) {
                this.value3 = value3;
            }

            public int getValue2() {
                return value2;
            }

            public void setValue2(int value2) {
                this.value2 = value2;
            }

            public int getValue5() {
                return value5;
            }

            public void setValue5(int value5) {
                this.value5 = value5;
            }

            public int getValue4() {
                return value4;
            }

            public void setValue4(int value4) {
                this.value4 = value4;
            }
        }
    }

    public static class ImagesBean {
        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class PopularCommentsBean {
        /**
         * max : 5
         * value : 1
         * min : 0
         */

        private RatingBean rating;
        private int useful_count;
        /**
         * uid : 62598926
         * avatar : http://img7.doubanio.com/icon/u62598926-1.jpg
         * signature :
         * alt : http://www.douban.com/people/62598926/
         * id : 62598926
         * name : 小曦讨厌下雨天
         */

        private AuthorBean author;
        private String subject_id;
        private String content;
        private String created_at;
        private String id;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public int getUseful_count() {
            return useful_count;
        }

        public void setUseful_count(int useful_count) {
            this.useful_count = useful_count;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class RatingBean {
            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBean {
            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class WritersBean {
        /**
         * small : http://img3.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png
         * large : http://img7.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png
         * medium : http://img3.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png
         */

        private AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class TrailersBean {
        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class CastsBean {
        /**
         * small : http://img7.doubanio.com/img/celebrity/small/1495272417.45.jpg
         * large : http://img7.doubanio.com/img/celebrity/large/1495272417.45.jpg
         * medium : http://img7.doubanio.com/img/celebrity/medium/1495272417.45.jpg
         */

        private AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class PhotosBean {
        private String thumb;
        private String image;
        private String cover;
        private String alt;
        private String id;
        private String icon;

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class DirectorsBean {
        /**
         * small : http://img3.doubanio.com/img/celebrity/small/1490348628.29.jpg
         * large : http://img3.doubanio.com/img/celebrity/large/1490348628.29.jpg
         * medium : http://img3.doubanio.com/img/celebrity/medium/1490348628.29.jpg
         */

        private AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class PopularReviewsBean {
        /**
         * max : 5
         * value : 1
         * min : 0
         */

        private RatingBean rating;
        private String title;
        private String subject_id;
        /**
         * uid : 123404248
         * avatar : http://img7.doubanio.com/icon/u123404248-3.jpg
         * signature :
         * alt : http://www.douban.com/people/123404248/
         * id : 123404248
         * name : 世界奇妙物语
         */

        private AuthorBean author;
        private String summary;
        private String alt;
        private String id;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class RatingBean {
            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBean {
            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
