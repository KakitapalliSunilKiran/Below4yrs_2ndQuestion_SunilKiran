package com.Area.stQues_below4yrs_SunilKiran.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Area.stQues_below4yrs_SunilKiran.JPARepo.CircleRepo;
import com.Area.stQues_below4yrs_SunilKiran.JPARepo.RectangleRepo;
import com.Area.stQues_below4yrs_SunilKiran.JPARepo.SquareRepo;
import com.Area.stQues_below4yrs_SunilKiran.Model.Circle;
import com.Area.stQues_below4yrs_SunilKiran.Model.Rectangle;
import com.Area.stQues_below4yrs_SunilKiran.Model.Square;





public class AreaController {
	
	@Autowired
	CircleRepo c1;
	
	@Autowired
	SquareRepo c2;
	
	@Autowired
	RectangleRepo c3;
	
	
	@RequestMapping("/AddCircle")
	public String addCircle(Circle circle) {
		
		circle.setType(circle.getType());
		circle.setRadius(circle.getRadius());
		circle.setArea(3.14*circle.getRadius()*circle.getRadius());
		c1.save(circle);
		return "circlepage.jsp";
	}
	
	@RequestMapping("/AddSquare")
	public String addSquare(Square square) {
		square.setType(square.getType());
		square.setSide(square.getSide());
		square.setArea(square.getSide()*square.getSide());
		c2.save(square);
		return "squarepage.jsp";
	}
	
	@RequestMapping("/AddRectangle")
	public String addRectangle(Rectangle rectangle) {
		rectangle.setType(rectangle.getType());
		rectangle.setBredth(rectangle.getBredth());
		rectangle.setLength(rectangle.getLength());
		rectangle.setArea(rectangle.getBredth()*rectangle.getLength());
		
		return "rectanglepage.jsp";
	}
	
	@RequestMapping("/getArea")
	public ModelAndView getAccount(@RequestParam("t1") int cid) {
		ModelAndView mv=new ModelAndView("OutPutArea.jsp");
		return mv;
	}
	
}
