package edu.mum.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by yentran
 */
//@Document
public class WishList {

    @Id
    private String id;
    private String desc;

//	@DBRef
//	private Catagory catagory;


    public WishList() {
    }

    @Override
    public String toString() {
        return "WishList {id='" + id + '\'' + ", desc='" + desc + '\'' + '}';
    }

    public String getWl_id() {
        return id;
    }

    public void setWl_id(String wl_id) {
        this.id = wl_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

//	public Catagory getCatagory() {
//		return catagory;
//	}
//
//	public void setCatagory(Catagory catagory) {
//		this.catagory = catagory;
//	}


}
