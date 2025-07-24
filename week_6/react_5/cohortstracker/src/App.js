import React from 'react';
import CohortDetails from './CohortDetails';
import { CohortsData } from './Cohort';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>All Cohorts Details</h1>
      {CohortsData.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
