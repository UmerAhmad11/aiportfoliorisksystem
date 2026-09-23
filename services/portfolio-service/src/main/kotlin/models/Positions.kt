data class Positions(
    val id: String,
    val assetSymbol: String,       // e.g., "AAPL", "BTC"
    val quantity: Double,          // e.g., 10.5
    val averageBuyPrice: Double,   // e.g., 175.50
    val assetType: String          // e.g., "STOCK", "CRYPTO"
)