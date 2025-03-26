package project.gittest.semiprojectv2.Service;

import project.gittest.semiprojectv2.domain.Board;
import project.gittest.semiprojectv2.domain.BoardListDTO;

public interface BoardService {

    Board newBoard(Board board);

    BoardListDTO readBoard(int cpg);
}
