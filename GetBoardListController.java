package jeonggeun.spring.web.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jeonggeun.spring.web.board.impl.BoardDAO;

@Controller
public class GetBoardListController{

	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO,ModelAndView mav) {
		System.out.println("�� ��� �˻� ó��");
		// 1. ����� �Է� ���� ���� : �˻� ����� ���߿� ����
		// 2. �����ͺ��̽� ���� ó��

		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		// 3. ���� ȭ�� ����

		mav.addObject("boardList", boardList); // Model ��������
		mav.setViewName("getBoardList.jsp");  // View ��������
		return mav;
	}

}