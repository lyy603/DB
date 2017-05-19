package com.db.movie_detail.mvp.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieDetailReviewsBean {

    /**
     * count : 1
     * reviews : [{"rating":{"max":5,"value":1,"min":0},"useful_count":21,"author":{"uid":"123404248","avatar":"https://img3.doubanio.com/icon/u123404248-3.jpg","signature":"","alt":"https://www.douban.com/people/123404248/","id":"123404248","name":"世界奇妙物语"},"created_at":"2017-01-19 21:46:33","title":"国产恐怖片，注定成烂片？","updated_at":"2017-01-23 20:38:42","share_url":"https://m.douban.com/movie/review/8301338","summary":"这一系列国产恐怖片太多，现在总结下国产电影拍摄门槛为什么这么低\u2026\u2026 1.找个导演，内地导演优先考虑(省钱)。 2.去网上热搜榜（也是经纪公司）上挑几个网红明星（省钱）。网红明星就像木偶一样被装扮上了。 3.去...","content":"这一系列国产恐怖片太多，现在总结下国产电影拍摄门槛为什么这么低\u2026\u2026\r\n1.找个导演，内地导演优先考虑(省钱)。\r\n2.去网上热搜榜（也是经纪公司）上挑几个网红明星（省钱）。网红明星就像木偶一样被装扮上了。\r\n3.去影视学院和北漂南漂找上其他演员龙套（省钱）。\r\n4.租个摄制组，拍摄场地，演出服。（如上）\r\n5.找二三线编剧（如上）或自己操刀花上一星期把剧本凑到一部电影时长（参考网上剧本的对话） \r\n6.拍完，就剪辑成89分钟左右的电影长度。\r\n7.打包给营销公司，目标是各样马凳占领各搜索微博等阵地(电影蹭热度)。内容主题只要不反动不犯罪随便换，一小时出现在页面前3条。\r\n8.全国各地影院排档期上映了（电影院排片多于鸿毛，分成不少）。\r\n一路过来的只要遵循国家法律制度，避开行业不成文的禁区基本绿灯通过。哪怕是伦理道德，逻辑规律。不触犯法律要求也是可以放低的，导演就是上帝。\r\n\r\n最后总结：如果算是创作的话，除了原著用了脑力，搭上劳力，主要靠资源配置，就可以公放收钱了。 \r\n\r\nps:国产恐怖片的组成：15%的创作+65%的钱+20%的劳力=作品","useless_count":0,"comments_count":1,"alt":"https://movie.douban.com/review/8301338/","id":"8301338","subject_id":"26865690"}]
     * start : 0
     * total : 8
     * next_start : 1
     * subject : {"rating":{"max":10,"average":2.7,"details":{"1":27,"3":0,"2":3,"5":2,"4":0},"stars":"15","min":0},"genres":["爱情","悬疑","惊悚"],"title":"恐怖理发店","casts":[{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1403756298.69.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1403756298.69.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1403756298.69.jpg"},"name_en":"Guoer Yin","name":"殷果儿","alt":"https://movie.douban.com/celebrity/1340984/","id":"1340984"},{"avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"Qingan Ren","name":"任青安","alt":"https://movie.douban.com/celebrity/1359164/","id":"1359164"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1451209491.55.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1451209491.55.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1451209491.55.jpg"},"name_en":"SungGoo Kang","name":"姜星丘","alt":"https://movie.douban.com/celebrity/1353667/","id":"1353667"}],"durations":["89分钟"],"collect_count":348,"mainland_pubdate":"2017-01-06","has_video":false,"original_title":"恐怖理发店","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"Shilei Lu","name":"陆诗雷","alt":"https://movie.douban.com/celebrity/1360707/","id":"1360707"}],"pubdates":["2017-01-06(中国大陆)"],"year":"2017","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2406903891.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2406903891.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2406903891.jpg"},"alt":"https://movie.douban.com/subject/26865690/","id":"26865690"}
     */

    private int count;
    private int start;
    private int total;
    private int next_start;
    /**
     * rating : {"max":10,"average":2.7,"details":{"1":27,"3":0,"2":3,"5":2,"4":0},"stars":"15","min":0}
     * genres : ["爱情","悬疑","惊悚"]
     * title : 恐怖理发店
     * casts : [{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1403756298.69.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1403756298.69.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1403756298.69.jpg"},"name_en":"Guoer Yin","name":"殷果儿","alt":"https://movie.douban.com/celebrity/1340984/","id":"1340984"},{"avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"Qingan Ren","name":"任青安","alt":"https://movie.douban.com/celebrity/1359164/","id":"1359164"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1451209491.55.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1451209491.55.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1451209491.55.jpg"},"name_en":"SungGoo Kang","name":"姜星丘","alt":"https://movie.douban.com/celebrity/1353667/","id":"1353667"}]
     * durations : ["89分钟"]
     * collect_count : 348
     * mainland_pubdate : 2017-01-06
     * has_video : false
     * original_title : 恐怖理发店
     * subtype : movie
     * directors : [{"avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name_en":"Shilei Lu","name":"陆诗雷","alt":"https://movie.douban.com/celebrity/1360707/","id":"1360707"}]
     * pubdates : ["2017-01-06(中国大陆)"]
     * year : 2017
     * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2406903891.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2406903891.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2406903891.jpg"}
     * alt : https://movie.douban.com/subject/26865690/
     * id : 26865690
     */

    private SubjectBean subject;
    /**
     * rating : {"max":5,"value":1,"min":0}
     * useful_count : 21
     * author : {"uid":"123404248","avatar":"https://img3.doubanio.com/icon/u123404248-3.jpg","signature":"","alt":"https://www.douban.com/people/123404248/","id":"123404248","name":"世界奇妙物语"}
     * created_at : 2017-01-19 21:46:33
     * title : 国产恐怖片，注定成烂片？
     * updated_at : 2017-01-23 20:38:42
     * share_url : https://m.douban.com/movie/review/8301338
     * summary : 这一系列国产恐怖片太多，现在总结下国产电影拍摄门槛为什么这么低…… 1.找个导演，内地导演优先考虑(省钱)。 2.去网上热搜榜（也是经纪公司）上挑几个网红明星（省钱）。网红明星就像木偶一样被装扮上了。 3.去...
     * content : 这一系列国产恐怖片太多，现在总结下国产电影拍摄门槛为什么这么低……
     1.找个导演，内地导演优先考虑(省钱)。
     2.去网上热搜榜（也是经纪公司）上挑几个网红明星（省钱）。网红明星就像木偶一样被装扮上了。
     3.去影视学院和北漂南漂找上其他演员龙套（省钱）。
     4.租个摄制组，拍摄场地，演出服。（如上）
     5.找二三线编剧（如上）或自己操刀花上一星期把剧本凑到一部电影时长（参考网上剧本的对话）
     6.拍完，就剪辑成89分钟左右的电影长度。
     7.打包给营销公司，目标是各样马凳占领各搜索微博等阵地(电影蹭热度)。内容主题只要不反动不犯罪随便换，一小时出现在页面前3条。
     8.全国各地影院排档期上映了（电影院排片多于鸿毛，分成不少）。
     一路过来的只要遵循国家法律制度，避开行业不成文的禁区基本绿灯通过。哪怕是伦理道德，逻辑规律。不触犯法律要求也是可以放低的，导演就是上帝。

     最后总结：如果算是创作的话，除了原著用了脑力，搭上劳力，主要靠资源配置，就可以公放收钱了。

     ps:国产恐怖片的组成：15%的创作+65%的钱+20%的劳力=作品
     * useless_count : 0
     * comments_count : 1
     * alt : https://movie.douban.com/review/8301338/
     * id : 8301338
     * subject_id : 26865690
     */

    private List<ReviewsBean> reviews;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNext_start() {
        return next_start;
    }

    public void setNext_start(int next_start) {
        this.next_start = next_start;
    }

    public SubjectBean getSubject() {
        return subject;
    }

    public void setSubject(SubjectBean subject) {
        this.subject = subject;
    }

    public List<ReviewsBean> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewsBean> reviews) {
        this.reviews = reviews;
    }

    public static class SubjectBean {
        /**
         * max : 10
         * average : 2.7
         * details : {"1":27,"3":0,"2":3,"5":2,"4":0}
         * stars : 15
         * min : 0
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String mainland_pubdate;
        private boolean has_video;
        private String original_title;
        private String subtype;
        private String year;
        /**
         * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2406903891.jpg
         * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2406903891.jpg
         * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2406903891.jpg
         */

        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        /**
         * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/1403756298.69.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1403756298.69.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1403756298.69.jpg"}
         * name_en : Guoer Yin
         * name : 殷果儿
         * alt : https://movie.douban.com/celebrity/1340984/
         * id : 1340984
         */

        private List<CastsBean> casts;
        private List<String> durations;
        /**
         * avatars : {"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"}
         * name_en : Shilei Lu
         * name : 陆诗雷
         * alt : https://movie.douban.com/celebrity/1360707/
         * id : 1360707
         */

        private List<DirectorsBean> directors;
        private List<String> pubdates;

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

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getMainland_pubdate() {
            return mainland_pubdate;
        }

        public void setMainland_pubdate(String mainland_pubdate) {
            this.mainland_pubdate = mainland_pubdate;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
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

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<String> getDurations() {
            return durations;
        }

        public void setDurations(List<String> durations) {
            this.durations = durations;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public List<String> getPubdates() {
            return pubdates;
        }

        public void setPubdates(List<String> pubdates) {
            this.pubdates = pubdates;
        }

        public static class RatingBean {
            private int max;
            private double average;
            /**
             * 1 : 27
             * 3 : 0
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

        public static class CastsBean {
            /**
             * small : https://img1.doubanio.com/img/celebrity/small/1403756298.69.jpg
             * large : https://img1.doubanio.com/img/celebrity/large/1403756298.69.jpg
             * medium : https://img1.doubanio.com/img/celebrity/medium/1403756298.69.jpg
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

        public static class DirectorsBean {
            /**
             * small : https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png
             * large : https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png
             * medium : https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png
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
    }

    public static class ReviewsBean {
        /**
         * max : 5
         * value : 1
         * min : 0
         */

        private RatingBean rating;
        private int useful_count;
        /**
         * uid : 123404248
         * avatar : https://img3.doubanio.com/icon/u123404248-3.jpg
         * signature :
         * alt : https://www.douban.com/people/123404248/
         * id : 123404248
         * name : 世界奇妙物语
         */

        private AuthorBean author;
        private String created_at;
        private String title;
        private String updated_at;
        private String share_url;
        private String summary;
        private String content;
        private int useless_count;
        private int comments_count;
        private String alt;
        private String id;
        private String subject_id;

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

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getUseless_count() {
            return useless_count;
        }

        public void setUseless_count(int useless_count) {
            this.useless_count = useless_count;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
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

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
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
