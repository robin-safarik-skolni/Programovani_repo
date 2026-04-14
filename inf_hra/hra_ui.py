import random

def print_board(board):
    """Print the current state of the board"""
    print("\n   0   1   2")
    for i in range(3):
        print(f"{i}  {board[i][0]} | {board[i][1]} | {board[i][2]}")
        if i < 2:
            print("  -----------")

def check_winner(board):
    """Check if there's a winner or if it's a tie"""
    # Check rows
    for row in board:
        if row[0] == row[1] == row[2] and row[0] != ' ':
            return row[0]
    
    # Check columns
    for col in range(3):
        if board[0][col] == board[1][col] == board[2][col] and board[0][col] != ' ':
            return board[0][col]
    
    # Check diagonals
    if board[0][0] == board[1][1] == board[2][2] and board[0][0] != ' ':
        return board[0][0]
    if board[0][2] == board[1][1] == board[2][0] and board[0][2] != ' ':
        return board[0][2]
    
    # Check for tie
    for row in board:
        if ' ' in row:
            return None  # Game not over
    
    return 'Tie'

def get_empty_cells(board):
    """Get list of empty cells as (row, col) tuples"""
    empty_cells = []
    for i in range(3):
        for j in range(3):
            if board[i][j] == ' ':
                empty_cells.append((i, j))
    return empty_cells

def computer_move(board):
    """Computer makes a move"""
    empty_cells = get_empty_cells(board)
    if empty_cells:
        # Try to win if possible
        for row, col in empty_cells:
            board[row][col] = 'O'
            if check_winner(board) == 'O':
                return
            board[row][col] = ' '  # Undo
        
        # Block player if they can win
        for row, col in empty_cells:
            board[row][col] = 'X'
            if check_winner(board) == 'X':
                board[row][col] = 'O'
                return
            board[row][col] = ' '  # Undo
        
        # Take center if available
        if (1, 1) in empty_cells:
            board[1][1] = 'O'
            return
        
        # Take a corner if available
        corners = [(0, 0), (0, 2), (2, 0), (2, 2)]
        available_corners = [cell for cell in corners if cell in empty_cells]
        if available_corners:
            row, col = random.choice(available_corners)
            board[row][col] = 'O'
            return
        
        # Take any available edge
        edges = [(0, 1), (1, 0), (1, 2), (2, 1)]
        available_edges = [cell for cell in edges if cell in empty_cells]
        if available_edges:
            row, col = random.choice(available_edges)
            board[row][col] = 'O'
            return
        
        # Fallback: random move
        row, col = random.choice(empty_cells)
        board[row][col] = 'O'

def player_move(board):
    """Get player's move"""
    while True:
        try:
            row = int(input("Zadej řádek (0-2): "))
            col = int(input("Zadej sloupec (0-2): "))
            
            if row < 0 or row > 2 or col < 0 or col > 2:
                print("Prosím zadej číslo mezi 0 a 2.")
                continue
            
            if board[row][col] != ' ':
                print("Toto pole je již obsazené. Zkus jiné.")
                continue
            
            board[row][col] = 'X'
            break
            
        except ValueError:
            print("Prosím zadej platné číslo.")

def main():
    """Main game loop"""
    print("Vítej ve hře Piškvorky (3x3)!")
    print("Hraješ za 'X', počítač za 'O'.")
    print("Počítač hraje první.")
    
    # Initialize board
    board = [[' ' for _ in range(3)] for _ in range(3)]
    
    current_player = 'O'  # Computer starts first
    
    while True:
        print_board(board)
        
        if current_player == 'O':
            print("\nHraje počítač...")
            computer_move(board)
            winner = check_winner(board)
            if winner:
                print_board(board)
                if winner == 'O':
                    print("\nPočítač vyhrál! Lepší štěstí příště.")
                else:
                    print("\nRemíza!")
                break
            current_player = 'X'
        else:
            print("\nTvoje tah:")
            player_move(board)
            winner = check_winner(board)
            if winner:
                print_board(board)
                if winner == 'X':
                    print("\nGratuluji! Vyhrál jsi!")
                else:
                    print("\nRemíza!")
                break
            current_player = 'O'

if __name__ == "__main__":
    main()