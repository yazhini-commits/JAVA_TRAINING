let hour = document.getElementById("hours");
let minute = document.getElementById("minutes");
let second = document.getElementById("seconds");

let startBtn = document.getElementById("startBtn");
let stopBtn = document.getElementById("stopBtn");

let sec = 0;
let min = 0;
let hr = 0;

let timer = null;

function startTimer() {
  if (timer !== null) {
    return;
  }

  startBtn.disabled = true;
  stopBtn.disabled = false;

  timer = setInterval(() => {
    sec++;

    if (sec > 59) {
      sec = 0;
      min++;
    }

    if (min > 59) {
      min = 0;
      hr++;
    }

    second.innerHTML = sec < 10 ? "0" + sec : sec;
    minute.innerHTML = min < 10 ? "0" + min : min;
    hour.innerHTML = hr < 10 ? "0" + hr : hr;
  }, 1000);
}

function stopTimer() {
  clearInterval(timer);
  timer = null;

  startBtn.disabled = false;
  stopBtn.disabled = true;
}

function resetTimer() {
  clearInterval(timer);
  timer = null;

  sec = 0;
  min = 0;
  hr = 0;

  second.innerHTML = "00";
  minute.innerHTML = "00";
  hour.innerHTML = "00";

  startBtn.disabled = false;
  stopBtn.disabled = true;
}
