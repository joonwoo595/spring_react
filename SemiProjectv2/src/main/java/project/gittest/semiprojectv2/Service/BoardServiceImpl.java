package project.gittest.semiprojectv2.Service;

import org.springframework.http.ResponseEntity;
import project.gittest.semiprojectv2.domain.Board;
import project.gittest.semiprojectv2.domain.Member;
import project.gittest.semiprojectv2.domain.User;
import project.gittest.semiprojectv2.repository.BoardRepository;
import project.gittest.semiprojectv2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements project.gittest.semiprojectv2.Service.BoardService {

    private final BoardRepository boardRepository;

    @Override
    public Board newBoard(Board board) {



        return boardRepository.save(board);
    }




}