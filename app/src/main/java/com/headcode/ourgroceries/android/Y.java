package com.headcode.ourgroceries.android;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class Y {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f34601b = Pattern.compile("(\\p{Punct})");

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f34602a;

    public Y(String str) {
        this.f34602a = a(str);
    }

    private static Pattern a(String str) {
        String str2;
        Matcher matcher = f34601b.matcher(str);
        HashSet hashSet = new HashSet();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null && group.length() > 0) {
                hashSet.add(Integer.valueOf(group.codePointAt(0)));
            }
        }
        if (hashSet.isEmpty()) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder(hashSet.size());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sb.appendCodePoint(((Integer) it.next()).intValue());
            }
            str2 = "&&[^" + Pattern.quote(sb.toString()) + "]";
        }
        return Pattern.compile("[\\p{Space}\\p{javaWhitespace}\\p{Punct}" + str2 + "]+");
    }

    public String[] b(String str) {
        return this.f34602a.split(str.replace("'", "").replace("’", "").replace("ʼ", ""));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f34602a.pattern(), ((Y) obj).f34602a.pattern());
    }
}
