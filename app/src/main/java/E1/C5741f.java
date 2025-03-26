package e1;

import android.database.Cursor;
import com.adadapted.android.sdk.core.ad.AdActionType;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: e1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5741f {

    /* renamed from: a, reason: collision with root package name */
    public final String f35295a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f35296b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f35297c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f35298d;

    /* renamed from: e1.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f35299a;

        /* renamed from: b, reason: collision with root package name */
        public final String f35300b;

        /* renamed from: c, reason: collision with root package name */
        public final int f35301c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35302d;

        /* renamed from: e, reason: collision with root package name */
        public final int f35303e;

        /* renamed from: f, reason: collision with root package name */
        public final String f35304f;

        /* renamed from: g, reason: collision with root package name */
        private final int f35305g;

        public a(String str, String str2, boolean z7, int i8, String str3, int i9) {
            this.f35299a = str;
            this.f35300b = str2;
            this.f35302d = z7;
            this.f35303e = i8;
            this.f35301c = a(str2);
            this.f35304f = str3;
            this.f35305g = i9;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f35303e != aVar.f35303e || !this.f35299a.equals(aVar.f35299a) || this.f35302d != aVar.f35302d) {
                return false;
            }
            if (this.f35305g == 1 && aVar.f35305g == 2 && (str3 = this.f35304f) != null && !str3.equals(aVar.f35304f)) {
                return false;
            }
            if (this.f35305g == 2 && aVar.f35305g == 1 && (str2 = aVar.f35304f) != null && !str2.equals(this.f35304f)) {
                return false;
            }
            int i8 = this.f35305g;
            return (i8 == 0 || i8 != aVar.f35305g || ((str = this.f35304f) == null ? aVar.f35304f == null : str.equals(aVar.f35304f))) && this.f35301c == aVar.f35301c;
        }

        public int hashCode() {
            return (((((this.f35299a.hashCode() * 31) + this.f35301c) * 31) + (this.f35302d ? 1231 : 1237)) * 31) + this.f35303e;
        }

        public String toString() {
            return "Column{name='" + this.f35299a + "', type='" + this.f35300b + "', affinity='" + this.f35301c + "', notNull=" + this.f35302d + ", primaryKeyPosition=" + this.f35303e + ", defaultValue='" + this.f35304f + "'}";
        }
    }

    /* renamed from: e1.f$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f35306a;

        /* renamed from: b, reason: collision with root package name */
        public final String f35307b;

        /* renamed from: c, reason: collision with root package name */
        public final String f35308c;

        /* renamed from: d, reason: collision with root package name */
        public final List f35309d;

        /* renamed from: e, reason: collision with root package name */
        public final List f35310e;

        public b(String str, String str2, String str3, List list, List list2) {
            this.f35306a = str;
            this.f35307b = str2;
            this.f35308c = str3;
            this.f35309d = DesugarCollections.unmodifiableList(list);
            this.f35310e = DesugarCollections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f35306a.equals(bVar.f35306a) && this.f35307b.equals(bVar.f35307b) && this.f35308c.equals(bVar.f35308c) && this.f35309d.equals(bVar.f35309d)) {
                return this.f35310e.equals(bVar.f35310e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f35306a.hashCode() * 31) + this.f35307b.hashCode()) * 31) + this.f35308c.hashCode()) * 31) + this.f35309d.hashCode()) * 31) + this.f35310e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f35306a + "', onDelete='" + this.f35307b + "', onUpdate='" + this.f35308c + "', columnNames=" + this.f35309d + ", referenceColumnNames=" + this.f35310e + '}';
        }
    }

    /* renamed from: e1.f$c */
    static class c implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        final int f35311o;

        /* renamed from: s, reason: collision with root package name */
        final int f35312s;

        /* renamed from: t, reason: collision with root package name */
        final String f35313t;

        /* renamed from: u, reason: collision with root package name */
        final String f35314u;

        c(int i8, int i9, String str, String str2) {
            this.f35311o = i8;
            this.f35312s = i9;
            this.f35313t = str;
            this.f35314u = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i8 = this.f35311o - cVar.f35311o;
            return i8 == 0 ? this.f35312s - cVar.f35312s : i8;
        }
    }

    /* renamed from: e1.f$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f35315a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35316b;

        /* renamed from: c, reason: collision with root package name */
        public final List f35317c;

        public d(String str, boolean z7, List list) {
            this.f35315a = str;
            this.f35316b = z7;
            this.f35317c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f35316b == dVar.f35316b && this.f35317c.equals(dVar.f35317c)) {
                return this.f35315a.startsWith("index_") ? dVar.f35315a.startsWith("index_") : this.f35315a.equals(dVar.f35315a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f35315a.startsWith("index_") ? -1184239155 : this.f35315a.hashCode()) * 31) + (this.f35316b ? 1 : 0)) * 31) + this.f35317c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f35315a + "', unique=" + this.f35316b + ", columns=" + this.f35317c + '}';
        }
    }

    public C5741f(String str, Map map, Set set, Set set2) {
        this.f35295a = str;
        this.f35296b = DesugarCollections.unmodifiableMap(map);
        this.f35297c = DesugarCollections.unmodifiableSet(set);
        this.f35298d = set2 == null ? null : DesugarCollections.unmodifiableSet(set2);
    }

    public static C5741f a(g1.b bVar, String str) {
        return new C5741f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map b(g1.b bVar, String str) {
        Cursor W7 = bVar.W("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (W7.getColumnCount() > 0) {
                int columnIndex = W7.getColumnIndex("name");
                int columnIndex2 = W7.getColumnIndex("type");
                int columnIndex3 = W7.getColumnIndex("notnull");
                int columnIndex4 = W7.getColumnIndex("pk");
                int columnIndex5 = W7.getColumnIndex("dflt_value");
                while (W7.moveToNext()) {
                    String string = W7.getString(columnIndex);
                    hashMap.put(string, new a(string, W7.getString(columnIndex2), W7.getInt(columnIndex3) != 0, W7.getInt(columnIndex4), W7.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            W7.close();
        }
    }

    private static List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < count; i8++) {
            cursor.moveToPosition(i8);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set d(g1.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor W7 = bVar.W("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = W7.getColumnIndex("id");
            int columnIndex2 = W7.getColumnIndex("seq");
            int columnIndex3 = W7.getColumnIndex("table");
            int columnIndex4 = W7.getColumnIndex("on_delete");
            int columnIndex5 = W7.getColumnIndex("on_update");
            List<c> c8 = c(W7);
            int count = W7.getCount();
            for (int i8 = 0; i8 < count; i8++) {
                W7.moveToPosition(i8);
                if (W7.getInt(columnIndex2) == 0) {
                    int i9 = W7.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c8) {
                        if (cVar.f35311o == i9) {
                            arrayList.add(cVar.f35313t);
                            arrayList2.add(cVar.f35314u);
                        }
                    }
                    hashSet.add(new b(W7.getString(columnIndex3), W7.getString(columnIndex4), W7.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            W7.close();
            return hashSet;
        } catch (Throwable th) {
            W7.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static d e(g1.b bVar, String str, boolean z7) {
        Cursor W7 = bVar.W("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = W7.getColumnIndex("seqno");
            int columnIndex2 = W7.getColumnIndex("cid");
            int columnIndex3 = W7.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (W7.moveToNext()) {
                    if (W7.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(W7.getInt(columnIndex)), W7.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z7, arrayList);
                W7.close();
                return dVar;
            }
            W7.close();
            return null;
        } catch (Throwable th) {
            W7.close();
            throw th;
        }
    }

    private static Set f(g1.b bVar, String str) {
        Cursor W7 = bVar.W("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = W7.getColumnIndex("name");
            int columnIndex2 = W7.getColumnIndex("origin");
            int columnIndex3 = W7.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (W7.moveToNext()) {
                    if (AdActionType.CONTENT.equals(W7.getString(columnIndex2))) {
                        String string = W7.getString(columnIndex);
                        boolean z7 = true;
                        if (W7.getInt(columnIndex3) != 1) {
                            z7 = false;
                        }
                        d e8 = e(bVar, string, z7);
                        if (e8 == null) {
                            return null;
                        }
                        hashSet.add(e8);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            W7.close();
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5741f c5741f = (C5741f) obj;
        String str = this.f35295a;
        if (str == null ? c5741f.f35295a != null : !str.equals(c5741f.f35295a)) {
            return false;
        }
        Map map = this.f35296b;
        if (map == null ? c5741f.f35296b != null : !map.equals(c5741f.f35296b)) {
            return false;
        }
        Set set2 = this.f35297c;
        if (set2 == null ? c5741f.f35297c != null : !set2.equals(c5741f.f35297c)) {
            return false;
        }
        Set set3 = this.f35298d;
        if (set3 == null || (set = c5741f.f35298d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f35295a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f35296b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f35297c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f35295a + "', columns=" + this.f35296b + ", foreignKeys=" + this.f35297c + ", indices=" + this.f35298d + '}';
    }
}
