package com.jonah.vttp5_ssf_day06ws.model;

public class Game {
    private Integer gid;
    private String name;
    private Integer year;
    private Integer ranking;
    private Integer users_rated;
    private String url;
    private String image;

    public Game() {
    }

    public Game(Integer gid, String name, Integer year, Integer ranking, Integer users_rated, String url,
            String image) {
        this.gid = gid;
        this.name = name;
        this.year = year;
        this.ranking = ranking;
        this.users_rated = users_rated;
        this.url = url;
        this.image = image;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getUsers_rated() {
        return users_rated;
    }

    public void setUsers_rated(Integer users_rated) {
        this.users_rated = users_rated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gid == null) ? 0 : gid.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((year == null) ? 0 : year.hashCode());
        result = prime * result + ((ranking == null) ? 0 : ranking.hashCode());
        result = prime * result + ((users_rated == null) ? 0 : users_rated.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((image == null) ? 0 : image.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (gid == null) {
            if (other.gid != null)
                return false;
        } else if (!gid.equals(other.gid))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year.equals(other.year))
            return false;
        if (ranking == null) {
            if (other.ranking != null)
                return false;
        } else if (!ranking.equals(other.ranking))
            return false;
        if (users_rated == null) {
            if (other.users_rated != null)
                return false;
        } else if (!users_rated.equals(other.users_rated))
            return false;
        if (url == null) {
            if (other.url != null)
                return false;
        } else if (!url.equals(other.url))
            return false;
        if (image == null) {
            if (other.image != null)
                return false;
        } else if (!image.equals(other.image))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return gid + "," + name + "," + year + "," + ranking + ","
                + users_rated + "," + url + "," + image;
    }

    


    
}
