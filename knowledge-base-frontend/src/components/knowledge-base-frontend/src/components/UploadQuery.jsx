import React, { useState } from 'react';
import axios from 'axios';

export default function UploadQuery() {
  const [file, setFile] = useState(null);
  const [query, setQuery] = useState('');
  const [answer, setAnswer] = useState('');

  const handleUpload = async () => {
    const formData = new FormData();
    formData.append('file', file);
    await axios.post('http://localhost:8080/api/upload', formData);
    alert('File uploaded successfully!');
  };

  const handleQuery = async () => {
    const res = await axios.post('http://localhost:8080/api/query', { query });
    setAnswer(res.data.answer);
  };

  return (
    <div className="bg-white p-8 rounded-2xl shadow-xl w-[500px]">
      <h1 className="text-2xl font-bold mb-4 text-center">📚 Knowledge Base Search</h1>
      <input type="file" onChange={(e) => setFile(e.target.files[0])} className="mb-4 w-full"/>
      <button onClick={handleUpload} className="w-full bg-blue-600 text-white py-2 rounded mb-4 hover:bg-blue-700 transition">Upload</button>
      <textarea value={query} onChange={(e) => setQuery(e.target.value)} placeholder="Ask your question..." className="w-full p-2 border rounded mb-4"/>
      <button onClick={handleQuery} className="w-full bg-green-600 text-white py-2 rounded hover:bg-green-700 transition">Ask</button>
      {answer && <p className="mt-4 text-gray-700 font-medium">{answer}</p>}
    </div>
  );
}