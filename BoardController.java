package jeonggeun.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jeonggeun.spring.web.board.impl.BoardDAO;

@Controller
public class BoardController {
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		//2.데이터베이스 연동 처리
		boardDAO.insertBoard(vo);
		//3.화면 네비게이션
		return "getBoardList.do";
	}

	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 수정 기능 처리");
		//2.데이터베이스 연동 처리
		boardDAO.updateBoard(vo);
		//3.화면 네비게이션
		return "getBoardList.do";
	}

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 삭제 처리");
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}

	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 상세 보기 처리");
		mav.addObject("board", boardDAO.getBoard(vo));
		mav.setViewName("getBoard.jsp");
		return mav;
	}

	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 검색 처리");
		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model 정보저장
		mav.setViewName("getBoardList.jsp"); // View 정보저장
		return mav;
	}
}
