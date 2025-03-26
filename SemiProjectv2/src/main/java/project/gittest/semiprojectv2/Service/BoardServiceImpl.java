package project.gittest.semiprojectv2.Service;

import org.springframework.beans.factory.annotation.Value;
import project.gittest.semiprojectv2.domain.Board;
import project.gittest.semiprojectv2.domain.BoardDTO;
import project.gittest.semiprojectv2.domain.BoardListDTO;
import project.gittest.semiprojectv2.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements project.gittest.semiprojectv2.Service.BoardService {

    private final BoardRepository boardRepository;

    @Value("${board.page-size}") private int pageSize;

    @Override
    public Board newBoard(Board board) {


        return boardRepository.save(board);
    }

    @Override
    public BoardListDTO readBoard(int cpg) {
        int stnum = (cpg - 1) * pageSize;
        int totalItems = (int) boardRepository.count();
        List<BoardDTO> boards = boardRepository.findBoards(stnum,pageSize);


        return new BoardListDTO(cpg, totalItems, pageSize, boards);
    }


}