(ns dooris-clojure.views.welcome
  (:require [dooris-clojure.views.common :as common])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to dooris-clojure"]))
