package jeonggeun.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jeonggeun.spring.web.board.impl.BoardDAO;

@Controller
public class InsertBoardController{

	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo,BoardDAO boardDAO) {
		System.out.println("�� ��� ó��");
		// 1. ����� �Է� ���� ����
		// request.setCharacterEncoding("UTF-8");
		
		// 2. �����ͺ��̽� ���� ó��
		boardDAO.insertBoard(vo);
		// 3. ȭ�� �׺���̼�


		return "getBoardList.do";
	}

}
