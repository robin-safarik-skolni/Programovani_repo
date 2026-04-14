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

def get_player_move(board, player):
    """Get player's move"""
    while True:
        try:
            print(f"\nHráč {player}, zadej svůj tah:")
            row = int(input("Zadej řádek (0-2): "))
            col = int(input("Zadej sloupec (0-2): "))
            
            if row < 0 or row > 2 or col < 0 or col > 2:
                print("Prosím zadej číslo mezi 0 a 2.")
                continue
            
            if board[row][col] != ' ':
                print("Toto pole je již obsazené. Zkus jiné.")
                continue
            
            board[row][col] = player
            break
            
        except ValueError:
            print("Prosím zadej platné číslo.")

def main():
    """Main game loop"""
    print("Vítej ve hře Piškvorky (3x3) pro dva hráče!")
    print("Hráč 1 hraje za 'X', Hráč 2 hraje za 'O'.")
    print("Hráč 1 začíná.")
    
    # Initialize board
    board = [[' ' for _ in range(3)] for _ in range(3)]
    
    current_player = 'X'  # Player 1 starts first
    
    while True:
        print_board(board)
        
        # Get player's move
        get_player_move(board, current_player)
        
        # Check for winner
        winner = check_winner(board)
        if winner:
            print_board(board)
            if winner == 'Tie':
                print("\nRemíza! Nikdo nevyhrál.")
            else:
                if winner == 'X':
                    print("\nGratuluji! Hráč 1 (X) vyhrál!")
                else:
                    print("\nGratuluji! Hráč 2 (O) vyhrál!")
            break
        
        # Switch players
        current_player = 'O' if current_player == 'X' else 'X'

if __name__ == "__main__":
    main()