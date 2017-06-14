package com.db.movie_detail.mvp.model.bean;

/**
 * 作者：lyy on 2017/5/26 15:19
 */

public class PersonDetailBean {
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
