(ns dooris-clojure.views.door
  (:require [clj-http.client :as client])
  (:use [noir.core :only [defpage]]))

(defpage "/door" []
           (let [response (client/get "http://dooris.koalo.de/door.txt")]
              (str (:body response))))