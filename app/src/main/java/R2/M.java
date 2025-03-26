package r2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.event.RecipeSources;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import h2.C5829c;
import h2.EnumC5832f;
import j$.util.Objects;
import j2.AbstractC6060i;
import j2.AbstractC6067p;
import j2.C6059h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import m2.C6187a;
import m2.C6188b;
import m2.C6189c;
import m2.C6190d;
import m2.C6191e;
import m2.C6192f;
import n2.AbstractC6247a;
import s2.InterfaceC6723a;
import t2.InterfaceC6791a;
import u2.AbstractC6812a;
import w6.InterfaceC6894a;

/* loaded from: classes.dex */
public class M implements InterfaceC6662d, InterfaceC6723a, InterfaceC6661c {

    /* renamed from: w, reason: collision with root package name */
    private static final C5829c f42472w = C5829c.b("proto");

    /* renamed from: o, reason: collision with root package name */
    private final W f42473o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC6791a f42474s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6791a f42475t;

    /* renamed from: u, reason: collision with root package name */
    private final AbstractC6663e f42476u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC6894a f42477v;

    interface b {
        Object apply(Object obj);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f42478a;

        /* renamed from: b, reason: collision with root package name */
        final String f42479b;

        private c(String str, String str2) {
            this.f42478a = str;
            this.f42479b = str2;
        }
    }

    interface d {
        Object a();
    }

    M(InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, AbstractC6663e abstractC6663e, W w7, InterfaceC6894a interfaceC6894a) {
        this.f42473o = w7;
        this.f42474s = interfaceC6791a;
        this.f42475t = interfaceC6791a2;
        this.f42476u = abstractC6663e;
        this.f42477v = interfaceC6894a;
    }

    private long A0() {
        return x0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long B0() {
        return x0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private C6192f C0() {
        final long a8 = this.f42474s.a();
        return (C6192f) E0(new b() { // from class: r2.C
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.O0(a8, (SQLiteDatabase) obj);
            }
        });
    }

    private Long D0(SQLiteDatabase sQLiteDatabase, AbstractC6067p abstractC6067p) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC6067p.b(), String.valueOf(AbstractC6812a.a(abstractC6067p.d()))));
        if (abstractC6067p.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC6067p.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) o1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: r2.x
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.P0((Cursor) obj);
            }
        });
    }

    private boolean F0() {
        return A0() * B0() >= this.f42476u.f();
    }

    private List G0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC6669k abstractC6669k = (AbstractC6669k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC6669k.c()))) {
                AbstractC6060i.a p8 = abstractC6669k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC6669k.c()))) {
                    p8.c(cVar.f42478a, cVar.f42479b);
                }
                listIterator.set(AbstractC6669k.a(abstractC6669k.c(), abstractC6669k.d(), p8.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H0(Cursor cursor) {
        while (cursor.moveToNext()) {
            g(cursor.getInt(0), C6189c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer I0(long j8, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j8)};
        o1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: r2.r
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42530a.H0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object J0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object K0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase L0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long M0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6192f N0(long j8, Cursor cursor) {
        cursor.moveToNext();
        return C6192f.c().c(cursor.getLong(0)).b(j8).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6192f O0(final long j8, SQLiteDatabase sQLiteDatabase) {
        return (C6192f) o1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: r2.D
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.N0(j8, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long P0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Q0(AbstractC6067p abstractC6067p, SQLiteDatabase sQLiteDatabase) {
        Long D02 = D0(sQLiteDatabase, abstractC6067p);
        return D02 == null ? Boolean.FALSE : (Boolean) o1(x0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{D02.toString()}), new b() { // from class: r2.t
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List R0(SQLiteDatabase sQLiteDatabase) {
        return (List) o1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: r2.J
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.S0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List S0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC6067p.a().b(cursor.getString(1)).d(AbstractC6812a.b(cursor.getInt(2))).c(i1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List T0(AbstractC6067p abstractC6067p, SQLiteDatabase sQLiteDatabase) {
        List g12 = g1(sQLiteDatabase, abstractC6067p, this.f42476u.d());
        for (EnumC5832f enumC5832f : EnumC5832f.values()) {
            if (enumC5832f != abstractC6067p.d()) {
                int d8 = this.f42476u.d() - g12.size();
                if (d8 <= 0) {
                    break;
                }
                g12.addAll(g1(sQLiteDatabase, abstractC6067p.f(enumC5832f), d8));
            }
        }
        return G0(g12, h1(sQLiteDatabase, g12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C6187a U0(Map map, C6187a.C0289a c0289a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C6189c.b m02 = m0(cursor.getInt(1));
            long j8 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C6189c.c().c(m02).b(j8).a());
        }
        j1(c0289a, map);
        return c0289a.e(C0()).d(z0()).c((String) this.f42477v.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C6187a V0(String str, final Map map, final C6187a.C0289a c0289a, SQLiteDatabase sQLiteDatabase) {
        return (C6187a) o1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: r2.A
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42459a.U0(map, c0289a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object W0(List list, AbstractC6067p abstractC6067p, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j8 = cursor.getLong(0);
            boolean z7 = cursor.getInt(7) != 0;
            AbstractC6060i.a o8 = AbstractC6060i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z7) {
                o8.h(new C6059h(m1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                o8.h(new C6059h(m1(cursor.getString(4)), k1(j8)));
            }
            if (!cursor.isNull(6)) {
                o8.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                o8.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                o8.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                o8.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                o8.k(cursor.getBlob(11));
            }
            list.add(AbstractC6669k.a(j8, abstractC6067p, o8.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object X0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j8 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j8));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j8), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long Y0(AbstractC6060i abstractC6060i, AbstractC6067p abstractC6067p, SQLiteDatabase sQLiteDatabase) {
        if (F0()) {
            g(1L, C6189c.b.CACHE_FULL, abstractC6060i.n());
            return -1L;
        }
        long q02 = q0(sQLiteDatabase, abstractC6067p);
        int e8 = this.f42476u.e();
        byte[] a8 = abstractC6060i.e().a();
        boolean z7 = a8.length <= e8;
        ContentValues contentValues = new ContentValues();
        contentValues.put(RecipeSources.CONTEXT_ID, Long.valueOf(q02));
        contentValues.put("transport_name", abstractC6060i.n());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC6060i.f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC6060i.o()));
        contentValues.put("payload_encoding", abstractC6060i.e().b().a());
        contentValues.put("code", abstractC6060i.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z7));
        contentValues.put(AdditContent.AdditSources.PAYLOAD, z7 ? a8 : new byte[0]);
        contentValues.put("product_id", abstractC6060i.l());
        contentValues.put("pseudonymous_id", abstractC6060i.m());
        contentValues.put("experiment_ids_clear_blob", abstractC6060i.g());
        contentValues.put("experiment_ids_encrypted_blob", abstractC6060i.h());
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z7) {
            int ceil = (int) Math.ceil(a8.length / e8);
            for (int i8 = 1; i8 <= ceil; i8++) {
                byte[] copyOfRange = Arrays.copyOfRange(a8, (i8 - 1) * e8, Math.min(i8 * e8, a8.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i8));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC6060i.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] Z0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i8 += blob.length;
        }
        byte[] bArr = new byte[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
            i9 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a1(Cursor cursor) {
        while (cursor.moveToNext()) {
            g(cursor.getInt(0), C6189c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        o1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: r2.u
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42535a.a1((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d1(String str, C6189c.b bVar, long j8, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) o1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.e())}), new b() { // from class: r2.y
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.c1((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j8 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.e())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.e()));
            contentValues.put("events_dropped_count", Long.valueOf(j8));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e1(long j8, AbstractC6067p abstractC6067p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j8));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC6067p.b(), String.valueOf(AbstractC6812a.a(abstractC6067p.d()))}) < 1) {
            contentValues.put("backend_name", abstractC6067p.b());
            contentValues.put("priority", Integer.valueOf(AbstractC6812a.a(abstractC6067p.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object f1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f42474s.a()).execute();
        return null;
    }

    private List g1(SQLiteDatabase sQLiteDatabase, final AbstractC6067p abstractC6067p, int i8) {
        final ArrayList arrayList = new ArrayList();
        Long D02 = D0(sQLiteDatabase, abstractC6067p);
        if (D02 == null) {
            return arrayList;
        }
        o1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", AdditContent.AdditSources.PAYLOAD, "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{D02.toString()}, null, null, null, String.valueOf(i8)), new b() { // from class: r2.v
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42536a.W0(arrayList, abstractC6067p, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map h1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((AbstractC6669k) list.get(i8)).c());
            if (i8 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        o1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: r2.z
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.X0(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    private static byte[] i1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void j1(C6187a.C0289a c0289a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0289a.a(C6190d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] k1(long j8) {
        return (byte[]) o1(x0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j8)}, null, null, "sequence_num"), new b() { // from class: r2.B
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.Z0((Cursor) obj);
            }
        });
    }

    private Object l1(d dVar, b bVar) {
        long a8 = this.f42475t.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e8) {
                if (this.f42475t.a() >= this.f42476u.b() + a8) {
                    return bVar.apply(e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private C6189c.b m0(int i8) {
        C6189c.b bVar = C6189c.b.REASON_UNKNOWN;
        if (i8 == bVar.e()) {
            return bVar;
        }
        C6189c.b bVar2 = C6189c.b.MESSAGE_TOO_OLD;
        if (i8 == bVar2.e()) {
            return bVar2;
        }
        C6189c.b bVar3 = C6189c.b.CACHE_FULL;
        if (i8 == bVar3.e()) {
            return bVar3;
        }
        C6189c.b bVar4 = C6189c.b.PAYLOAD_TOO_BIG;
        if (i8 == bVar4.e()) {
            return bVar4;
        }
        C6189c.b bVar5 = C6189c.b.MAX_RETRIES_REACHED;
        if (i8 == bVar5.e()) {
            return bVar5;
        }
        C6189c.b bVar6 = C6189c.b.INVALID_PAYLOD;
        if (i8 == bVar6.e()) {
            return bVar6;
        }
        C6189c.b bVar7 = C6189c.b.SERVER_ERROR;
        if (i8 == bVar7.e()) {
            return bVar7;
        }
        AbstractC6247a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i8));
        return bVar;
    }

    private static C5829c m1(String str) {
        return str == null ? f42472w : C5829c.b(str);
    }

    private static String n1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC6669k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object o1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private void p0(final SQLiteDatabase sQLiteDatabase) {
        l1(new d() { // from class: r2.l
            @Override // r2.M.d
            public final Object a() {
                return M.J0(sQLiteDatabase);
            }
        }, new b() { // from class: r2.w
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.K0((Throwable) obj);
            }
        });
    }

    private long q0(SQLiteDatabase sQLiteDatabase, AbstractC6067p abstractC6067p) {
        Long D02 = D0(sQLiteDatabase, abstractC6067p);
        if (D02 != null) {
            return D02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC6067p.b());
        contentValues.put("priority", Integer.valueOf(AbstractC6812a.a(abstractC6067p.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC6067p.c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC6067p.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private C6188b z0() {
        return C6188b.b().b(C6191e.c().b(u0()).c(AbstractC6663e.f42513a.f()).a()).a();
    }

    Object E0(b bVar) {
        SQLiteDatabase x02 = x0();
        x02.beginTransaction();
        try {
            Object apply = bVar.apply(x02);
            x02.setTransactionSuccessful();
            return apply;
        } finally {
            x02.endTransaction();
        }
    }

    @Override // r2.InterfaceC6662d
    public Iterable L() {
        return (Iterable) E0(new b() { // from class: r2.G
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.R0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // r2.InterfaceC6662d
    public long S(AbstractC6067p abstractC6067p) {
        return ((Long) o1(x0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC6067p.b(), String.valueOf(AbstractC6812a.a(abstractC6067p.d()))}), new b() { // from class: r2.H
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.M0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // r2.InterfaceC6662d
    public void Z(final AbstractC6067p abstractC6067p, final long j8) {
        E0(new b() { // from class: r2.o
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.e1(j8, abstractC6067p, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // r2.InterfaceC6662d
    public boolean a0(final AbstractC6067p abstractC6067p) {
        return ((Boolean) E0(new b() { // from class: r2.n
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42522a.Q0(abstractC6067p, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42473o.close();
    }

    @Override // s2.InterfaceC6723a
    public Object d(InterfaceC6723a.InterfaceC0328a interfaceC0328a) {
        SQLiteDatabase x02 = x0();
        p0(x02);
        try {
            Object a8 = interfaceC0328a.a();
            x02.setTransactionSuccessful();
            return a8;
        } finally {
            x02.endTransaction();
        }
    }

    @Override // r2.InterfaceC6661c
    public void e() {
        E0(new b() { // from class: r2.p
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42526a.f1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // r2.InterfaceC6661c
    public C6187a f() {
        final C6187a.C0289a e8 = C6187a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C6187a) E0(new b() { // from class: r2.s
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42531a.V0(str, hashMap, e8, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // r2.InterfaceC6661c
    public void g(final long j8, final C6189c.b bVar, final String str) {
        E0(new b() { // from class: r2.q
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.d1(str, bVar, j8, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // r2.InterfaceC6662d
    public AbstractC6669k n0(final AbstractC6067p abstractC6067p, final AbstractC6060i abstractC6060i) {
        AbstractC6247a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC6067p.d(), abstractC6060i.n(), abstractC6067p.b());
        long longValue = ((Long) E0(new b() { // from class: r2.m
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42519a.Y0(abstractC6060i, abstractC6067p, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC6669k.a(longValue, abstractC6067p, abstractC6060i);
    }

    @Override // r2.InterfaceC6662d
    public int o() {
        final long a8 = this.f42474s.a() - this.f42476u.c();
        return ((Integer) E0(new b() { // from class: r2.I
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42465a.I0(a8, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // r2.InterfaceC6662d
    public void q(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            x0().compileStatement("DELETE FROM events WHERE _id in " + n1(iterable)).execute();
        }
    }

    @Override // r2.InterfaceC6662d
    public Iterable r(final AbstractC6067p abstractC6067p) {
        return (Iterable) E0(new b() { // from class: r2.L
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return this.f42470a.T0(abstractC6067p, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // r2.InterfaceC6662d
    public void t0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + n1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            E0(new b() { // from class: r2.K
                @Override // r2.M.b
                public final Object apply(Object obj) {
                    return this.f42467a.b1(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    long u0() {
        return A0() * B0();
    }

    SQLiteDatabase x0() {
        final W w7 = this.f42473o;
        Objects.requireNonNull(w7);
        return (SQLiteDatabase) l1(new d() { // from class: r2.E
            @Override // r2.M.d
            public final Object a() {
                return w7.getWritableDatabase();
            }
        }, new b() { // from class: r2.F
            @Override // r2.M.b
            public final Object apply(Object obj) {
                return M.L0((Throwable) obj);
            }
        });
    }
}
