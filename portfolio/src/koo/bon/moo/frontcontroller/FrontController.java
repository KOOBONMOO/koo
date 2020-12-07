package koo.bon.moo.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import koo.bon.moo.command.Command;
import koo.bon.moo.command.board.DeleteCommand;
import koo.bon.moo.command.board.ListCommand;
import koo.bon.moo.command.board.ModifyOKCommand;
import koo.bon.moo.command.board.ReplyCommand;
import koo.bon.moo.command.board.ReplyOKCommand;
import koo.bon.moo.command.board.SearchCommand;
import koo.bon.moo.command.board.ViewCommand;
import koo.bon.moo.command.board.WriteOKCommand;
import koo.bon.moo.command.member.LoginCommand;
import koo.bon.moo.command.member.MemberModifyOKCommand;
import koo.bon.moo.command.member.MemberRegisterOKCommand;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String requestURI = request.getRequestURI();
		System.out.println("requestURI " + requestURI);
		String commandName = request.getServletPath();
		System.out.println("servletPath " +  commandName);
		String viewPage = null;
		Command command = null;
		int flag = 0;
		
		if(commandName.equals("/board/list.do")) {
			command = new ListCommand();
			command.excute(request, response);
			viewPage = "list.jsp";
			flag = 1;
		} else if(commandName.equals("/board/write.do")) {
			viewPage = "write.jsp";
		} else if(commandName.equals("/board/writeOK.do")) {
			command = new WriteOKCommand();
			command.excute(request, response);
			viewPage = "list.do";
		} else if(commandName.equals("/board/view.do")) {
			command = new ViewCommand();
			command.excute(request, response);
			viewPage = "view.jsp";
			flag = 1;
		} else if(commandName.equals("/board/modifyOK.do")) {
			command = new ModifyOKCommand();
			command.excute(request, response);
			viewPage = "list.do";
		} else if(commandName.equals("/board/reply.do")) {
			command = new ReplyCommand();
			command.excute(request, response);
			viewPage = "reply.jsp";
			flag = 1;
		} else if(commandName.equals("/board/replyOK.do")) {
			command = new ReplyOKCommand();
			command.excute(request, response);
			viewPage = "list.do";
		} else if(commandName.equals("/board/delete.do")) {
			command = new DeleteCommand();
			command.excute(request, response);
			viewPage = "list.do";
			
			////////////////////////////////////////////////////////////////////////
			
		} else if(commandName.equals("/main.do")) {
			viewPage = "main/main.jsp";
		} else if(commandName.equals("/Member/login.do")) {
			command = new LoginCommand();
			command.excute(request, response);			
			viewPage = "../main.do";
		} else if(commandName.equals("/Member/memberRegister.do")) {
			viewPage = "memberRegister.jsp";
		} else if(commandName.equals("/Member/memberRegisterOK.do")) {
			command = new MemberRegisterOKCommand();
			command.excute(request, response);
			viewPage = "../main.do";
		} else if(commandName.equals("/Member/memberModify.do")) {
			viewPage = "memberModify.jsp";
		} else if(commandName.equals("/Member/memberModifyOK.do")) {
			command = new MemberModifyOKCommand();
			command.excute(request, response);
			viewPage = "../main/main.jsp";
		} else if(commandName.equals("/board/search.do")) {
			command = new SearchCommand();
			command.excute(request, response);
			viewPage = "searchList.jsp";
			flag = 1;
		} else if(commandName.equals("/logout.do")) {
			request.getSession().invalidate();
			viewPage = "main/main.jsp";
		}
		
		if(flag==0) {
			response.sendRedirect(viewPage);
		} else if(flag==1) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);			
		}		
	}
}