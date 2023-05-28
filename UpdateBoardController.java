package jeonggeun.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jeonggeun.spring.web.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ��� ó��");
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}
}
