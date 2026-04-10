package com.naver.sth.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pager {

	//한페이지에 출력할 글의 갯수
	private Long perPage;
	
	//페이지 번호
	private Long page;
	//jsp 시작 번호
	private Long start;
	
	//jsp 끝 번호
	private Long end;
	//시작 rownum
	private Long first;
	//끝 rownum
	private Long last;
	//이전 블럭 유무
	private boolean pre;
	//다음 블럭 유무
	private boolean next;
	
	public void makeRowNumber() throws Exception {
		
		this.first=(this.getPage()-1)*this.getperPage()+1;
		this.last=this.getPage()*this.getperPage();
		
		
		
	}
	
	public Long getperPage() {
		if(this.perPage==null || this.perPage%5 !=0) {
			this.perPage=10L;
		}		
		
		return this.perPage;
	}
	
	public Long getPage() {
		if(this.page==null ||this.page<1) {
			this.page=1L;
			
		}
		return this.page;
	}
	//------------------
	
	public void makePageNumber(Long totalCount) throws Exception{
		
		Long totalPage=totalCount/this.getperPage();
		if(totalCount%this.perPage !=0) {
			totalPage++;		
		}
		if(page>totalPage) {
			page=totalPage;
		}
		//블럭의 갯수 파악
		Long Block=5L;
		Long totalBlock=totalPage/Block;
		if(totalPage%Block !=0) {
			
			totalBlock++;
		}
		//현재 페이지 번호로 현재 블럭 구하기
		Long cruBlock=this.getPage()/Block;
		if(this.getPage()%Block !=0) {
			cruBlock++;
		}
		// 현재 블럭 번호로 시작번호 끝번호 구하기
		Long start = (cruBlock-1)*Block+1;
		Long end =cruBlock*Block;
		this.setStart(start);
		this.setEnd(end);
		//이전 블럭이 존재하면 true 아니면 false
		if(cruBlock>1) {
			this.pre=true;
			
		}
		//다음 블럭이 존재하면 true 아니면 false
		if(cruBlock < totalBlock) {
			this.next=true;
			
		}else {
			this.setEnd(totalPage);
		}
		this.makeRowNumber();
		
		
	}
	
	
	
	
	
	
	
}
