package Ensolvers.Test;

import antlr.Utils;
import Ensolvers.Test.Model.BoardPackage.ColumnEnum;
import Ensolvers.Test.Model.BoardPackage.Move;
import Ensolvers.Test.Model.BoardPackage.Position;
import Ensolvers.Test.Model.GamePackage.Helper.GameToSave;
import Ensolvers.Test.Model.GamePackage.Helper.SaveToGame;
import Ensolvers.Test.Model.PiecesPackage.Color;
import Ensolvers.Test.Model.PiecesPackage.Piece;
import Ensolvers.Test.Model.PiecesPackage.PiecesEnum;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChessClassesTest {

    @Test
    public void testConvertBoardToString() throws InvocationTargetException, IllegalAccessException,NoSuchMethodException{
        Piece[][] board = new Piece[8][8];

        board[0][0] = new Piece(PiecesEnum.Rook, Color.White);
        board[0][1] = new Piece(PiecesEnum.Knight, Color.White);
        board[0][2] = new Piece(PiecesEnum.Bishop, Color.White);
        board[0][3] = new Piece(PiecesEnum.Queen, Color.White);
        board[0][4] = new Piece(PiecesEnum.King, Color.White);
        board[0][5] = new Piece(PiecesEnum.Bishop, Color.White);
        board[0][6] = new Piece(PiecesEnum.Knight, Color.White);
        board[0][7] = new Piece(PiecesEnum.Rook, Color.White);
        board[1][0] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][1] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][2] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][3] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][4] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][5] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][6] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][7] = new Piece(PiecesEnum.Pawn, Color.White);

        // Piezas negras
        board[7][0] = new Piece(PiecesEnum.Rook, Color.Black);
        board[7][1] = new Piece(PiecesEnum.Knight, Color.Black);
        board[7][2] = new Piece(PiecesEnum.Bishop, Color.Black);
        board[7][3] = new Piece(PiecesEnum.Queen, Color.Black);
        board[7][4] = new Piece(PiecesEnum.King, Color.Black);
        board[7][5] = new Piece(PiecesEnum.Bishop, Color.Black);
        board[7][6] = new Piece(PiecesEnum.Knight, Color.Black);
        board[7][7] = new Piece(PiecesEnum.Rook, Color.Black);
        board[6][0] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][1] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][2] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][3] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][4] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][5] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][6] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][7] = new Piece(PiecesEnum.Pawn, Color.Black);

        String expected = "RookW0AKnigW0BBishW0CQueeW0DKingW0EBishW0FKnigW0GRookW0HPawnW1APawnW1BPawnW1CPawnW1DPawnW1EPawnW1FPawnW1GPawnW1HPawnB6APawnB6BPawnB6CPawnB6DPawnB6EPawnB6FPawnB6GPawnB6HRookB7AKnigB7BBishB7CQueeB7DKingB7EBishB7FKnigB7GRookB7H";


        Method BTS = GameToSave.class.getDeclaredMethod("ConvertBoardToString", Piece[][].class);
        BTS.setAccessible(true);
        String result =(String) BTS.invoke(null, (Object) board);

        assertEquals(expected, result);
    }


    @Test
    public void testConvertStringToBoard() throws InvocationTargetException, IllegalAccessException,NoSuchMethodException{
        String sent = "RookW0AKnigW0BBishW0CQueeW0DKingW0EBishW0FKnigW0GRookW0HPawnW1APawnW1BPawnW1CPawnW1DPawnW1EPawnW1FPawnW1GPawnW1HPawnB6APawnB6BPawnB6CPawnB6DPawnB6EPawnB6FPawnB6GPawnB6HRookB7AKnigB7BBishB7CQueeB7DKingB7EBishB7FKnigB7GRookB7H";

        Piece[][] board = new Piece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = null;
            }
        }
        board[0][0] = new Piece(PiecesEnum.Rook, Color.White);
        board[0][1] = new Piece(PiecesEnum.Knight, Color.White);
        board[0][2] = new Piece(PiecesEnum.Bishop, Color.White);
        board[0][3] = new Piece(PiecesEnum.Queen, Color.White);
        board[0][4] = new Piece(PiecesEnum.King, Color.White);
        board[0][5] = new Piece(PiecesEnum.Bishop, Color.White);
        board[0][6] = new Piece(PiecesEnum.Knight, Color.White);
        board[0][7] = new Piece(PiecesEnum.Rook, Color.White);
        board[1][0] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][1] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][2] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][3] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][4] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][5] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][6] = new Piece(PiecesEnum.Pawn, Color.White);
        board[1][7] = new Piece(PiecesEnum.Pawn, Color.White);

        // Piezas negras
        board[7][0] = new Piece(PiecesEnum.Rook, Color.Black);
        board[7][1] = new Piece(PiecesEnum.Knight, Color.Black);
        board[7][2] = new Piece(PiecesEnum.Bishop, Color.Black);
        board[7][3] = new Piece(PiecesEnum.Queen, Color.Black);
        board[7][4] = new Piece(PiecesEnum.King, Color.Black);
        board[7][5] = new Piece(PiecesEnum.Bishop, Color.Black);
        board[7][6] = new Piece(PiecesEnum.Knight, Color.Black);
        board[7][7] = new Piece(PiecesEnum.Rook, Color.Black);
        board[6][0] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][1] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][2] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][3] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][4] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][5] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][6] = new Piece(PiecesEnum.Pawn, Color.Black);
        board[6][7] = new Piece(PiecesEnum.Pawn, Color.Black);
        Method STB = SaveToGame.class.getDeclaredMethod("ConvertStringToBoard", String.class);
        STB.setAccessible(true);
        Piece[][] resultBoard = (Piece[][]) STB.invoke(null,sent);

        assertArrayEquals(board, resultBoard);
    }

    @Test
    public void testConvertMovesToString() throws InvocationTargetException, IllegalAccessException,NoSuchMethodException{
        List<Move> movesList = new ArrayList<>();
        Position from = new Position(ColumnEnum.A, 8);
        Position to = new Position(ColumnEnum.D, 6);
        Move move = new Move(from, to);
        movesList.add(move);
        Method MTS = GameToSave.class.getDeclaredMethod("ConvertMovesToString", List.class);
        MTS.setAccessible(true);
        String resultBoard = (String) MTS.invoke(null,movesList);
        System.out.println(resultBoard);
        assertEquals("A8-D6 ", resultBoard);
    }

    @Test
    public void testConvertMovesToList() throws InvocationTargetException, IllegalAccessException,NoSuchMethodException{
        List<Move> movesList = new ArrayList<>();
        Position from = new Position(ColumnEnum.A, 8);
        Position to = new Position(ColumnEnum.D, 6);
        Move move = new Move(from, to);
        movesList.add(move);
        from = new Position(ColumnEnum.C, 2);
        to = new Position(ColumnEnum.B, 4);
        move = new Move(from, to);
        movesList.add(move);
        Method MTS = GameToSave.class.getDeclaredMethod("ConvertMovesToString", List.class);
        MTS.setAccessible(true);
        String resultBoard = MTS.invoke(null,movesList).toString();
        Method MTL = SaveToGame.class.getDeclaredMethod("ConvertMovesToList", String.class);
        MTL.setAccessible(true);
        List<Move> movesList2 = (List<Move>) MTL.invoke(null,resultBoard);
        for (Move move1 : movesList
        ) {
            System.out.println(move1.asString());
        }
        for (Move move1 : movesList2
        ) {
            System.out.println(move1.asString());
        }
        movesList.equals(movesList2);
    }

    @Test
    public void testConvertKPToString() throws InvocationTargetException, IllegalAccessException,NoSuchMethodException{
        List<Piece> killedPieces = new ArrayList<>();
        killedPieces.add(new Piece(PiecesEnum.Bishop, Color.Black));
        killedPieces.add(new Piece(PiecesEnum.Knight, Color.White));
        killedPieces.add(new Piece(PiecesEnum.Rook, Color.Black));

        Method KTS = GameToSave.class.getDeclaredMethod("ConvertKPToString", List.class);
        KTS.setAccessible(true);
        String result = KTS.invoke(null,killedPieces).toString();

        assertEquals("Bishop-Black Knight-White Rook-Black ", result);
    }

    @Test
    public void testConvertKPToList() throws InvocationTargetException, IllegalAccessException,NoSuchMethodException{
        String stringkp = "Bishop-Black Knight-White Rook-Black ";


        Method KTL = SaveToGame.class.getDeclaredMethod("ConvertKPToList", String.class);
        KTL.setAccessible(true);
        List<Piece> result = (List<Piece>) KTL.invoke(null,stringkp);

        assertEquals(3, result.size());

        Piece piece1 = result.get(0);
        assertEquals(PiecesEnum.Bishop, piece1.getPieceType());
        assertEquals(Color.Black, piece1.getColor());

        Piece piece2 = result.get(1);
        assertEquals(PiecesEnum.Knight, piece2.getPieceType());
        assertEquals(Color.White, piece2.getColor());

        Piece piece3 = result.get(2);
        assertEquals(PiecesEnum.Rook, piece3.getPieceType());
        assertEquals(Color.Black, piece3.getColor());
    }

}
