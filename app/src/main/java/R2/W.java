package r2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class W extends SQLiteOpenHelper {

    /* renamed from: A, reason: collision with root package name */
    private static final a f42485A;

    /* renamed from: B, reason: collision with root package name */
    private static final a f42486B;

    /* renamed from: C, reason: collision with root package name */
    private static final List f42487C;

    /* renamed from: t, reason: collision with root package name */
    private static final String f42488t = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: u, reason: collision with root package name */
    static int f42489u = 7;

    /* renamed from: v, reason: collision with root package name */
    private static final a f42490v;

    /* renamed from: w, reason: collision with root package name */
    private static final a f42491w;

    /* renamed from: x, reason: collision with root package name */
    private static final a f42492x;

    /* renamed from: y, reason: collision with root package name */
    private static final a f42493y;

    /* renamed from: z, reason: collision with root package name */
    private static final a f42494z;

    /* renamed from: o, reason: collision with root package name */
    private final int f42495o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f42496s;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: r2.O
            @Override // r2.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.l(sQLiteDatabase);
            }
        };
        f42490v = aVar;
        a aVar2 = new a() { // from class: r2.P
            @Override // r2.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.m(sQLiteDatabase);
            }
        };
        f42491w = aVar2;
        a aVar3 = new a() { // from class: r2.Q
            @Override // r2.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f42492x = aVar3;
        a aVar4 = new a() { // from class: r2.S
            @Override // r2.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.z(sQLiteDatabase);
            }
        };
        f42493y = aVar4;
        a aVar5 = new a() { // from class: r2.T
            @Override // r2.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.A(sQLiteDatabase);
            }
        };
        f42494z = aVar5;
        a aVar6 = new a() { // from class: r2.U
            @Override // r2.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f42485A = aVar6;
        a aVar7 = new a() { // from class: r2.V
            @Override // r2.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.D(sQLiteDatabase);
            }
        };
        f42486B = aVar7;
        f42487C = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    W(Context context, String str, int i8) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i8);
        this.f42496s = false;
        this.f42495o = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f42488t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void E(SQLiteDatabase sQLiteDatabase, int i8) {
        k(sQLiteDatabase);
        G(sQLiteDatabase, 0, i8);
    }

    private void G(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        List list = f42487C;
        if (i9 <= list.size()) {
            while (i8 < i9) {
                ((a) f42487C.get(i8)).a(sQLiteDatabase);
                i8++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i8 + " to " + i9 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void k(SQLiteDatabase sQLiteDatabase) {
        if (this.f42496s) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f42496s = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        E(sQLiteDatabase, this.f42495o);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        E(sQLiteDatabase, i9);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        k(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        k(sQLiteDatabase);
        G(sQLiteDatabase, i8, i9);
    }
}
