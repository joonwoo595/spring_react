package project.gittest.semiprojectv2.Service;

import project.gittest.semiprojectv2.domain.Board;
import project.gittest.semiprojectv2.domain.BoardDTO;
import project.gittest.semiprojectv2.domain.BoardListDTO;
import org.springframework.data.domain.Page;

public interface BoardService {

    Board newBoard(Board board);

    BoardListDTO readBoard(int cpg);

    BoardListDTO findBoard(int cpg, String findtype, String findkey);

    Page<BoardDTO> testReadBoard(int cpg);

}