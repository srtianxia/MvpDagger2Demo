package com.srtianxia.mvpdagger2demo.model.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srtianxia on 2016/1/23.
 */
public class Story {
    private List<String> images = new ArrayList<String>();
    private Integer type;
    private Integer id;
    private String gaPrefix;
    private String title;
    private Boolean multipic;

    /**
     *
     * @return
     *     The images
     */
    public List<String> getImages() {
        return images;
    }

    /**
     *
     * @param images
     *     The images
     */
    public void setImages(List<String> images) {
        this.images = images;
    }

    /**
     *
     * @return
     *     The type
     */
    public Integer getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     *
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The gaPrefix
     */
    public String getGaPrefix() {
        return gaPrefix;
    }

    /**
     *
     * @param gaPrefix
     *     The ga_prefix
     */
    public void setGaPrefix(String gaPrefix) {
        this.gaPrefix = gaPrefix;
    }

    /**
     *
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The multipic
     */
    public Boolean getMultipic() {
        return multipic;
    }

    /**
     *
     * @param multipic
     *     The multipic
     */
    public void setMultipic(Boolean multipic) {
        this.multipic = multipic;
    }
}
