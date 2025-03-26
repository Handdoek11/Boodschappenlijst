package com.adadapted.android.sdk.core.view;

import J6.r;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.adadapted.android.sdk.core.keyword.KeywordInterceptMatcher;
import com.adadapted.android.sdk.core.keyword.Suggestion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x6.C6916E;

/* loaded from: classes.dex */
public final class AutoCompleteAdapter extends ArrayAdapter<String> {
    public static final int $stable = 8;
    private final List<String> allItems;
    private final Set<Suggestion> currentSuggestions;
    private final Filter interceptFilter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCompleteAdapter(Context context, int i8, List<String> list) {
        super(context.getApplicationContext(), i8, list);
        r.e(context, "context");
        r.e(list, "items");
        this.allItems = new ArrayList(list);
        this.currentSuggestions = new HashSet();
        this.interceptFilter = new Filter() { // from class: com.adadapted.android.sdk.core.view.AutoCompleteAdapter$interceptFilter$1
            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                Set<Suggestion> match;
                Filter.FilterResults filterResults = new Filter.FilterResults();
                ArrayList arrayList = new ArrayList();
                this.this$0.currentSuggestions.clear();
                if (charSequence != null && (match = KeywordInterceptMatcher.INSTANCE.match(charSequence)) != null) {
                    this.this$0.currentSuggestions.addAll(match);
                }
                for (Suggestion suggestion : this.this$0.currentSuggestions) {
                    arrayList.add(suggestion.getName());
                    suggestion.presented();
                }
                String valueOf = String.valueOf(charSequence);
                for (String str : this.this$0.allItems) {
                    if (S6.h.z(str, valueOf, true)) {
                        arrayList.add(str);
                    } else if (S6.h.E(str, valueOf, true)) {
                        arrayList.add(str);
                    }
                }
                filterResults.values = new ArrayList(arrayList);
                filterResults.count = arrayList.size();
                return filterResults;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                this.this$0.clear();
                if (filterResults == null || filterResults.count <= 0) {
                    return;
                }
                Object obj = filterResults.values;
                r.c(obj, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                AutoCompleteAdapter autoCompleteAdapter = this.this$0;
                for (Object obj2 : (ArrayList) obj) {
                    if (obj2 instanceof String) {
                        autoCompleteAdapter.add(obj2);
                    }
                }
                C6916E c6916e = C6916E.f44463a;
                this.this$0.notifyDataSetChanged();
            }
        };
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.interceptFilter;
    }

    public final void suggestionSelected(String str) {
        Object obj;
        r.e(str, "name");
        Iterator<T> it = this.currentSuggestions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (r.a(((Suggestion) obj).getName(), str)) {
                    break;
                }
            }
        }
        Suggestion suggestion = (Suggestion) obj;
        if (suggestion != null) {
            suggestion.selected();
        }
    }
}
