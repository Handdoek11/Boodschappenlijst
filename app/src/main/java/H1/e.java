package h1;

import android.database.sqlite.SQLiteStatement;
import g1.f;

/* loaded from: classes.dex */
class e extends C5826d implements f {

    /* renamed from: s, reason: collision with root package name */
    private final SQLiteStatement f36204s;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f36204s = sQLiteStatement;
    }

    @Override // g1.f
    public long w0() {
        return this.f36204s.executeInsert();
    }

    @Override // g1.f
    public int x() {
        return this.f36204s.executeUpdateDelete();
    }
}
