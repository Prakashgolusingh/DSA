int el = 0;
        int count = 0;
        for(int i=0; i<size; i++)
        {
            if(count == 0)
            {
                el = a[i];
                count++;
            }
            else
            {
                if(a[i] == el)
                    count++;
                else
                    count--;
            }
        }
        count = 0;
        for(int i: a)
        {
            if(i == el)
                count++;
        }
        if(count>size/2)
            return el;
        return -1;
