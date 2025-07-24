import '../Stylesheets/mystyle.css';

const percentToDecimal = (decimal) => {
  return decimal.toFixed(2) + '%';
};

const calcScore = (total, goal) => {
  return percentToDecimal(total / goal);
};

export const CalculateScore = ({ Name, School, total, goal }) => (
  <div className="formatstyle">
    <h1 style={{ color: 'brown' }}>Student Details:</h1>

    <div className="name">
      <b>Name:</b> <span>{Name}</span>
    </div>

    <div className="school">
      <b>School:</b> <span>{School}</span>
    </div>

    <div className="total">
      <b>Total:</b> <span>{total}</span> <span>Marks</span>
    </div>

    <div className="score">
      <b>Score:</b> <span>{calcScore(total, goal)}</span>
    </div>
  </div>
);