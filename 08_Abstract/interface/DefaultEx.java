interface Collection {
    void add(Object item);          // 既存のメソッド
    void remove(Object item);       // 既存のメソッド
    void forEach(Action action);    // 新しく追加するメソッド
}

// Collection インタフェースを実装するクラス
class MyList implements Collection {
    public void add(Object item) { /* ... */ }
    public void remove(Object item) { /* ... */ }
    // forEach() を実装していないのでエラー
}


