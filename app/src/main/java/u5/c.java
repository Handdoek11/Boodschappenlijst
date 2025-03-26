package u5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f44017a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f44018b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final List f44019c;

    /* renamed from: d, reason: collision with root package name */
    static final f f44020d;

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C6817a c6817a, C6817a c6817a2) {
            return c6817a2.c().length() - c6817a.c().length();
        }
    }

    static {
        try {
            InputStream resourceAsStream = AbstractC6818b.class.getResourceAsStream("/emojis.json");
            List<C6817a> d8 = AbstractC6818b.d(resourceAsStream);
            f44019c = d8;
            for (C6817a c6817a : d8) {
                for (String str : c6817a.b()) {
                    Map map = f44018b;
                    if (map.get(str) == null) {
                        map.put(str, new HashSet());
                    }
                    ((Set) map.get(str)).add(c6817a);
                }
                Iterator it = c6817a.a().iterator();
                while (it.hasNext()) {
                    f44017a.put((String) it.next(), c6817a);
                }
            }
            f44020d = new f(d8);
            Collections.sort(f44019c, new a());
            resourceAsStream.close();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static C6817a a(String str) {
        if (str == null) {
            return null;
        }
        return f44020d.a(str);
    }
}
