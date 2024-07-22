package com.multi.q1;

public class DeptVO {
    private String DeptNo;
    private String Dname;
    private String Loc;

    public String getDeptNo() {
        return DeptNo;
    }
    public String getDname() {
        return Dname;
    }
    public String getLoc() {
        return Loc;
    }

    public void setDname(String dname) {
        this.Dname = dname;
    }

    public void setLoc(String loc) {
        this.Loc = loc;
    }

    public void setDeptNo(String deptNo) {
        this.DeptNo = deptNo;
    }

    @Override
    public String toString() {
        return "검색 결과>> deptNo = " + DeptNo + "\n검색 결과>> deptName = " + Dname + "\n검색 결과>> Loc = " + Loc;
    }
}
