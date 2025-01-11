function ProductCard({productName, price, description, inStock}) {

    const cardStyle = {
        backgroundColor: inStock ? "teal" : "darkslategray",
        color: "wheat",
        width: "400px",
        float: "left",
        padding: "10px",
        margin: "10px",
        borderRadius: "5px",
    }

    const cardBox = {
        width: "900px",
    }

    return (
        <div style={cardBox}>
            <div style={cardStyle}>
                <h2>제품명 : {productName}</h2>
                <p>가격 : {price}</p>
                <p>설명 : {description}</p>
                <p>상태 : {inStock ? "활성" : "비활성"}</p>
            </div>
        </div>
    );
}
// 기본값 설정
ProductCard.defaultProps = {
    productName : "이름 정보 없음",
    price : "나이 정보 없음",
    description : "직업 정보 없음",
}


export default ProductCard;